package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SystemConfigEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/system/071_systemconfig/SystemConfig_SQL.xml";
    public HashMap insertSystemConfig(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SystemConfigEJBDAO.InsertSystemConfig", param);
    }
    public Collection selectSystemConfigList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SystemConfigEJBDAO.SelectSystemConfigList", param);
    }
    public HashMap selectSystemConfigDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SystemConfigEJBDAO.SelectSystemConfigDetail", param);
    }
    public HashMap updateSystemConfig(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SystemConfigEJBDAO.UpdateSystemConfig", param);
    }
    public HashMap deleteSystemConfig(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SystemConfigEJBDAO.DeleteSystemConfig", param);
    }
}