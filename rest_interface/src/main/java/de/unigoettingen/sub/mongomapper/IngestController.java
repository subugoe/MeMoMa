package de.unigoettingen.sub.mongomapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by jpanzer.
 * mets_mongo_mapper.
 * <p/>
 * 12/2013
 */
@Controller
@Scope(value = "request")
public class IngestController {

    private final Logger logger = LoggerFactory.getLogger(IngestController.class);

    @Autowired
    private MongoImporter mongoImporter;


    /**
     * Takes the given METS file and processes the migration to mongodb
     * <p/>
     * Request:     /documents/ingest?handling=reject
     *
     * @param file     The METS file to store in mongodb.
     * @param handling If a document is already in the db it will be replaced. The existence test will be performed
     *                 via the (recordInfo) recordIdentifier element. Possibilities values:
     *                 reject:     Rejects the request, the file will not be stored.
     *                 replace:    The new METS file will replace an existing document in mongoDB (default).
     * @param request  The HttpServletRequest object.
     */
    @RequestMapping(value = "/documents/ingest", method = RequestMethod.POST)
    public
    @ResponseBody
    void ingestMetsDoc(@RequestParam("file") MultipartFile file,
                       @RequestParam(value = "handling", defaultValue = "replace") String handling,
                       HttpServletRequest request) {

        mongoImporter.storeMetsDocument(file, handling, request);
    }

}
