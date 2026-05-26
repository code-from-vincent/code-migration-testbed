package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ChangeRequestEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/project/147_changerequest/ChangeRequest_SQL.xml";
    public HashMap insertChangeRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ChangeRequestEJBDAO.InsertChangeRequest", param);
    }
    public Collection selectChangeRequestList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ChangeRequestEJBDAO.SelectChangeRequestList", param);
    }
    public HashMap selectChangeRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ChangeRequestEJBDAO.SelectChangeRequestDetail", param);
    }
    public HashMap updateChangeRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ChangeRequestEJBDAO.UpdateChangeRequest", param);
    }
    public HashMap deleteChangeRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ChangeRequestEJBDAO.DeleteChangeRequest", param);
    }
}