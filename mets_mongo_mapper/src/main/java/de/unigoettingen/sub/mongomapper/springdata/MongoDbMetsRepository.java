package de.unigoettingen.sub.mongomapper.springdata;


import de.unigoettingen.sub.jaxb.MdSecType;
import de.unigoettingen.sub.jaxb.Mets;
import de.unigoettingen.sub.jaxb.Mods;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * Created by jpanzer on 17.02.14.
 */
@Repository
public class MongoDbMetsRepository implements MetsRepository {

    private final MongoOperations operations;

    @Autowired
    public MongoDbMetsRepository(MongoOperations operations) {
        this.operations = operations;
    }

    //--- Mets section

    @Override
    public Mets findOne(String docid) {

        Query query = query(where("id").is(new ObjectId(docid)));
        return operations.findOne(query, Mets.class);
    }

    @Override
    public List<Mets> findAll() {
        return operations.findAll(Mets.class);
    }

    @Override
    public Mets findMetsByModsId(String docid) {

        Query query = query(where("dmdSecs.mdWrap.xmlData.mods.$id").is(new ObjectId(docid)));
        return operations.findOne(query, Mets.class);
    }

    @Override
    public Mets save(Mets mets) {
        operations.save(mets);
        return mets;
    }

    @Override
    public void removeMets(String docid) {
        Query query = query(where("_id").is(new ObjectId(docid)));
        operations.remove(query, Mets.class);
    }





    //--- Mods section

    @Override
    public Mods findFirstMods(String docid) {

        Query query = query(where("id").is(new ObjectId(docid)));
        return operations.findOne(query, Mods.class);
    }

    @Override
    public Mods findModsByRecordIdentifier(String ppn) {

        Query query = query(where("elements.elements").elemMatch(new Criteria().andOperator(
                where("_class").is("de.unigoettingen.sub.jaxb.RecordInfoType$RecordIdentifier").and("value").is(ppn))));
        return operations.findOne(query, Mods.class);

    }

    @Override
    public Mods save(Mods mods) {
        operations.save(mods);
        return mods;
    }

    @Override
    public void removeMods(String docid) {

        Query query = query(where("_id").is(new ObjectId(docid)));
        operations.remove(query, Mods.class);
    }

}