package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CmdbRelationshipEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/itsm/166_cmdbrelationship/CmdbRelationship_SQL.xml";
    public HashMap insertCmdbRelationship(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CmdbRelationshipEJBDAO.InsertCmdbRelationship", param);
    }
    public Collection selectCmdbRelationshipList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CmdbRelationshipEJBDAO.SelectCmdbRelationshipList", param);
    }
    public HashMap selectCmdbRelationshipDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CmdbRelationshipEJBDAO.SelectCmdbRelationshipDetail", param);
    }
    public HashMap updateCmdbRelationship(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CmdbRelationshipEJBDAO.UpdateCmdbRelationship", param);
    }
    public HashMap deleteCmdbRelationship(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CmdbRelationshipEJBDAO.DeleteCmdbRelationship", param);
    }
}