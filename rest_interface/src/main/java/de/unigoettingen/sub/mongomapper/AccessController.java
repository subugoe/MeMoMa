package de.unigoettingen.sub.mongomapper;

import de.unigoettingen.sub.mongomapper.access.MongoExporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpanzer.
 * mets_mongo_mapper.
 * <p/>
 * 12/2013
 */
@Controller
@Scope(value = "request")
public class AccessController {

    private final Logger logger = LoggerFactory.getLogger(AccessController.class);


    @Autowired
    private MongoExporter mongoExporter;


    @RequestMapping(value = "/collections", method = RequestMethod.GET, produces = "application/xml")
    public
    @ResponseBody
    String getCollectionsAsXML(@RequestParam(value = "props", required = false) List<String> props,
                               @RequestParam(value = "start", required = false, defaultValue = "1") int start,
                               @RequestParam(value = "number", required = false, defaultValue = "25") int number,
                               Model model) {

        if (props == null) {
            props = new ArrayList<>();
        }

        return mongoExporter.getCollectionsAsXML(props, start, number);

    }

    @RequestMapping(value = "/collections", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    String getCollectionsAsJSON(@RequestParam(value = "props", required = false) List<String> props,
                                @RequestParam(value = "start", required = false, defaultValue = "1") int start,
                                @RequestParam(value = "number", required = false, defaultValue = "25") int number,
                                Model model) {

        if (props == null) {
            props = new ArrayList<>();
        }

        return mongoExporter.getCollectionsAsJSON(props, start, number).toString();

    }


    /**
     * Collects information about the documents in the repository.
     * <p/>
     * request: /documents ? props=id & props=...}
     * header:  Accept: application/xml
     *
     * @param props Reduce the docinfo to a required infoset. Possible values for
     *              props are:
     *              {id | title | titleShort | mets | preview | tei | teiEnriched | ralatedItems | classifications}
     * @param start Reduce the docinfo to a required infoset. Possible values for
     * @param number Reduce the docinfo to a required infoset. Possible values for
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A List of documents with a set of desciptive information, encoded in XML.
     */
    @RequestMapping(value = "/documents", method = RequestMethod.GET, produces = "application/xml")
    public
    @ResponseBody
    String getDocumentsAsXML(@RequestParam(value = "props", required = false) List<String> props,
                             @RequestParam(value = "start", required = false, defaultValue = "1") int start,
                             @RequestParam(value = "number", required = false, defaultValue = "25") int number,
                             Model model) {

        if (props == null) {
            props = new ArrayList<>();
        }

        return mongoExporter.getDocumentsAsXML(props, start, number);

    }

    /**
     * Collects information about the documents in the repository.
     * <p/>
     * request: /documents ? props=id & props=...}
     * header:  Accept: application/json
     *
     * @param props Reduce the docinfo to a required infoset. Possible values for
     *              props are:
     *              {id | title | titleShort | mets | preview | tei | teiEnriched | ralatedItems | classifications}
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A List of documents with a set of desciptive information, encoded in JSON.
     */
    @RequestMapping(value = "/documents", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    String getDocumentsAsJSON(@RequestParam(value = "props", required = false) List<String> props,
                              @RequestParam(value = "start", required = false, defaultValue = "1") int start,
                              @RequestParam(value = "number", required = false, defaultValue = "25") int number,
                              Model model) {

        if (props == null) {
            props = new ArrayList<>();
        }

        return mongoExporter.getDocumentsAsJSON(props, start, number).toString();

    }

    /**
     * Collects information about the documents in the repository.
     * <p/>
     * request: /documents ? props=id & props=...}
     * header:  Accept: application/xml
     *
     * @param props Reduce the docinfo to a required infoset. Possible values for
     *              props are:
     *              {id | title | titleShort | mets | preview | tei | teiEnriched | ralatedItems | classifications}
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A List of documents with a set of desciptive information, encoded in XML.
     */
    @RequestMapping(value = "/documents/{docid}", method = RequestMethod.GET, produces = "application/xml")
    public
    @ResponseBody
    String getDocumentAsXML(@PathVariable("docid") String docid,
                            @RequestParam(value = "props", required = false) List<String> props,
                            Model model) {

        if (props == null) {
            props = new ArrayList<>();
        }

        String doc = mongoExporter.getDocumentAsXML(docid, props);

        if (doc == null)
            return null;

        return mongoExporter.getDocumentAsXML(docid, props);


//        if (AjaxUtils.isAjaxRequest(request)) {
//            response.setHeader("Content-Type", "application/json");
//            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//            return "Unknown error occurred: " + ex.getMessage();
//        } else {
//            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, ex.getMessage());
//            return null;
//        }

    }

    /**
     * Collects information about the documents in the repository.
     * <p/>
     * request: /documents ? props=id & props=...}
     * header:  Accept: application/json
     *
     * @param props Reduce the docinfo to a required infoset. Possible values for
     *              props are:
     *              {id | title | titleShort | mets | preview | tei | teiEnriched | ralatedItems | classifications}
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A List of documents with a set of desciptive information, encoded in JSON.
     */
    @RequestMapping(value = "/documents/{docid}", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    String getDocumentAsJSON(@PathVariable("docid") String docid,
                             @RequestParam(value = "props", required = false) List<String> props,
                             Model model) {

        if (props == null) {
            props = new ArrayList<>();
        }


        return mongoExporter.getDocumentAsJSON(docid, props).toString();

    }


    /**
     * Returns an  outline of a document.
     *
     * @param docid The MongoDB id of the related mongoDB object, or any PID.
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A document with outline info.
     */
    @RequestMapping(value = "/documents/{docid}/outline", method = RequestMethod.GET)
    public
    @ResponseBody
    String getDocumentOutline(@PathVariable("docid") String docid, Model model) {

        return mongoExporter.getDocumentOutline(docid);
    }


    /**
     * Returns the full text of a single page.
     *
     * @param docid  The MongoDB id of the related mongoDB object, or any PID.
     * @param pageno The pagenumber of the requested page.
     * @param model  The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A special representation (e.g. PDF, HTML) for the requested page.
     */
    @RequestMapping(value = "/documents/{docid}/text/{pageno}", method = RequestMethod.GET)
    public
    @ResponseBody
    String getDocumentPageText(@PathVariable("docid") String docid,
                               @PathVariable("pageno") String pageno, Model model) {

        return mongoExporter.getDocumentRepresentation(docid, pageno);
    }

    /**
     * Returns a page representation of a document.
     *
     * @param docid The MongoDB id of the related mongoDB object, or any PID.
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A special representation (e.g. PDF, HTML) for the requested document.
     */
    @RequestMapping(value = "/documents/{docid}/text", method = RequestMethod.GET)
    public
    @ResponseBody
    String getDocumentPage(@PathVariable("docid") String docid, Model model) {

        return mongoExporter.getDocumentRepresentation(docid);
    }


    /**
     * Searchterm based search in a special document.
     * <p/>
     * request: /documents/{docid}/search?query=...
     *
     * @param docid The MongoDB id of the related mongoDB object, or any PID.
     * @param query The string based searchterm.
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A list of pages which match the query.
     */
    @RequestMapping(value = "/documents/{docid}/search", method = RequestMethod.GET)
    public
    @ResponseBody
    String getDocumentSearchResults(@PathVariable("docid") String docid,
                                    @RequestParam(value = "query", defaultValue = "") String query, Model model) {

        // TODO with higlightning or code snipped ?

        return mongoExporter.getSearchResults(docid, query);

    }

    /**
     * Searchterm based search over all documents in the db.
     * <p/>
     * request: /documents/search?query=...
     *
     * @param query The searchterm. The requst will be forwarded to mongoDB to search
     *              within the metadata elements.
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A list of documents which match the query.
     */
    @RequestMapping(value = "/documents/search", method = RequestMethod.GET)
    public
    @ResponseBody
    String getDBSearchResults(@RequestParam(value = "query", defaultValue = "") String query,
                              Model model) {

        // TODO with higlightning or code snipped ?

        return mongoExporter.getSearchResults(query);
    }

    /**
     * Accepts OAI2 metadate requests. Metadata is extracted from the object metadata
     * Info is extracted http://www.openarchives.org/OAI/openarchivesprotocol.html#ProtocolMessages
     * <p/>
     * /documents/oai2/verb=..&...
     *
     * @param query Accepts one of the six oai verbs with related arguments.
     *              verb=GetRecord is used to get metadata for the object with the given id
     *              Args:   identifier      - object identifier
     *              metadataPrefix  - oai_dc or oai_mets
     *              <p/>
     *              verb=Identify is used to get information about the repository
     *              Args:   -
     *              <p/>
     *              verb=ListIdentifiers is used to retrieve just the headers of records
     *              Args:   from            - optional, defines a timestamp to restrict results
     *              until           - like from, but an upper boundary
     *              metadataPrefix  - oai_dc or oai_mets
     *              set             - optional, defines criteria to restrict the request
     *              resumptionToken  - argument to  continue a previous requiest
     *              <p/>
     *              verb=ListMetadataFormats is used to retrieve the supported metadata formats info
     *              Args:   identifier      - optional, to get the supported formats for the given object (id)
     *              <p/>
     *              verb=ListRecords is used to get the metadata for all objects (see GetRecord)
     *              Args:   same as for ListIdentifiers
     *              <p/>
     *              verb=ListSets is used to retrieve the set structure
     *              Args:   resumptionToken - see ListIdentifiers
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A document with OAI conform results.
     */
    @RequestMapping(value = "/documents/oai2/{query}", method = RequestMethod.GET)
    public
    @ResponseBody
    String getPmhResults(@PathVariable("query") String query, Model model) {

        return mongoExporter.getOai2Results(query);
    }

    /**
     * Returns the METS document.
     * <p/>
     * request: /documents/{docid}/mets
     *
     * @param docid    The MongoDB id of the related mongoDB object.
     * @param response The HttpServletResponse object.
     */
    @RequestMapping(value = "/documents/{docid}/mets", method = RequestMethod.GET)
    public
    @ResponseBody
    void getDocumentMets(@PathVariable("docid") String docid,
                         HttpServletResponse response) {

        response.setContentType("application/xml");

        InputStream in = mongoExporter.getEmeddedFileDocument(docid, "mets");
        try {
            if (in != null) {
                FileCopyUtils.copy(in, response.getOutputStream());
                response.flushBuffer();
            } else {
                // TODO better return required, e.g. a redirect to an error page
                response.sendError(HttpServletResponse.SC_NOT_FOUND, "Requested mets document is not available for Id: " + docid);
            }
        } catch (IOException e) {
            logger.error("Error on writing mets file to the output stream.");
            //throw new RuntimeException("IOError on writing mets file to the output stream.");
        }
    }


    /**
     * Returns the related TEI document.
     * <p/>
     * request: /documents/{docid}/tei?type={tei | enriched}
     *
     * @param docid    The MongoDB id of the related mongoDB object, or any PID.
     * @param teiType  The TEI type, possibillities are tei (default) or teiEnriched.
     * @param response The HttpServletResponse object.
     */
    @RequestMapping(value = "/documents/{docid}/tei", method = RequestMethod.GET)
    public
    @ResponseBody
    void getDocumentTEI(@PathVariable("docid") String docid,
                        @RequestParam(value = "teiType", defaultValue = "tei") String teiType,
                        HttpServletResponse response) {

        response.setContentType("application/xml");

        InputStream in = mongoExporter.getEmeddedFileDocument(docid, "tei", teiType);

        try {
            if (in != null) {
                FileCopyUtils.copy(in, response.getOutputStream());
                response.flushBuffer();
            } else {
                // TODO better return required, e.g. a redirect to an error page
                response.sendError(HttpServletResponse.SC_NOT_FOUND, "Requested tei document is not available for Id: " + docid);
            }
        } catch (IOException e) {
            logger.error("Error on writing tei file to the output stream.");
            //throw new RuntimeException("IOError on writing mets file to the output stream.");
        }
    }


    /**
     * Retrieves a list of values for a special tag used in the document, e.g. tei:persName, tei:placeName
     *
     * @param docid The MongoDB id of the related mongoDB object, or any PID.
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A document with special tag info.
     */
    @RequestMapping(value = "/documents/{docid}/tags", method = RequestMethod.GET)
    public
    @ResponseBody
    String getDocumentTags(@PathVariable("docid") String docid, Model model) {

        return mongoExporter.getDocumentTags(docid);
    }

    /**
     * Retrieves a list of values for a special tag used on a page, e.g. tei:persName, tei:placeName
     *
     * @param docid      The MongoDB id of the related mongoDB object, or any PID.
     * @param pageNumber The page number of the for which to get the tags.
     * @param model      The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A document with special tag info.
     */
    @RequestMapping(value = "/documents/{docid}/tags/{pageNumber}", method = RequestMethod.GET)
    public
    @ResponseBody
    String getDocumentTags(@PathVariable("docid") String docid, @PathVariable("pageNumber") int pageNumber, Model model) {

        return mongoExporter.getPageTags(docid, pageNumber);
    }

    /**
     * Retrieves a list of possible tags.
     *
     * @param docid The MongoDB id of the related mongoDB object, or any PID.
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A document with tag info.
     */
    @RequestMapping(value = "/documents/{docid}/facets", method = RequestMethod.GET)
    public
    @ResponseBody
    String getFacets(@PathVariable("docid") String docid, Model model) {

        return mongoExporter.getFacets(docid);
    }

    /**
     * Returns the KML for places, contained in the document (KML: geographic annotation).
     *
     * @param docid The MongoDB id of the related mongoDB object, or any PID.
     * @param model The Spring-Model objekt, required for transmission of parameters within the request scope.
     * @return A document with KML info.
     */
    @RequestMapping(value = "/documents/{docid}/kml", method = RequestMethod.GET)
    public
    @ResponseBody
    String getDocumentKml(@PathVariable("docid") String docid, Model model) {

        return mongoExporter.getDocumentKml(docid);
    }

    /**
     * Checks, if an object with the given pid is already in the db.
     *
     * @param pid   The pid of the document to search.
     * @param model
     * @return The docid of the document or null if it doesn't exist.
     */
    @RequestMapping(value = "/documents/{pid}/exist", method = RequestMethod.GET)
    public
    @ResponseBody
    String isPidInDB(@PathVariable("pid") String pid, Model model) {


        String docid = mongoExporter.isInDB(pid);

        if (docid == null) {
            return null;
        } else
            return docid;
    }

    /**
     * Checks, if an METS file is already in the db.
     *
     * @param filename The name of the file for which to check.
     * @param model
     * @return The docid of the document or null if it doesn't exist.
     */
    @RequestMapping(value = "/documents/{filename}/exist", method = RequestMethod.GET)
    public
    @ResponseBody
    String isFileInDB(@PathVariable("filename") String filename, Model model) {

        String docid = mongoExporter.isFileInDB(filename);

        if (docid == null) {
            System.out.println("docid==null für -> " + filename);
            return null;
        } else
            return docid;
    }


//    @ExceptionHandler(NoSuchRequestHandlingMethodException.class)
//    public ModelAndView handleException(NoSuchRequestHandlingMethodException ex) {
//        ModelAndView mav = new ModelAndView();
//        logger.error("Exception found: " + ex);
//        return mav;
//    }

}
