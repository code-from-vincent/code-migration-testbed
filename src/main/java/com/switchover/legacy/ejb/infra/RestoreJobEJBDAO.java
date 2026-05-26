package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class RestoreJobEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/infra/158_restorejob/RestoreJob_SQL.xml";
    public HashMap insertRestoreJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RestoreJobEJBDAO.InsertRestoreJob", param);
    }
    public Collection selectRestoreJobList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "RestoreJobEJBDAO.SelectRestoreJobList", param);
    }
    public HashMap selectRestoreJobDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RestoreJobEJBDAO.SelectRestoreJobDetail", param);
    }
    public HashMap updateRestoreJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RestoreJobEJBDAO.UpdateRestoreJob", param);
    }
    public HashMap deleteRestoreJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RestoreJobEJBDAO.DeleteRestoreJob", param);
    }
}