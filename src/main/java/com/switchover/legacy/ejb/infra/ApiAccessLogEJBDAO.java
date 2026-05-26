package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ApiAccessLogEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/infra/068_apiaccesslog/ApiAccessLog_SQL.xml";
    public HashMap insertApiAccessLog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApiAccessLogEJBDAO.InsertApiAccessLog", param);
    }
    public Collection selectApiAccessLogList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ApiAccessLogEJBDAO.SelectApiAccessLogList", param);
    }
    public HashMap selectApiAccessLogDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApiAccessLogEJBDAO.SelectApiAccessLogDetail", param);
    }
    public HashMap updateApiAccessLog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApiAccessLogEJBDAO.UpdateApiAccessLog", param);
    }
    public HashMap deleteApiAccessLog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApiAccessLogEJBDAO.DeleteApiAccessLog", param);
    }
}