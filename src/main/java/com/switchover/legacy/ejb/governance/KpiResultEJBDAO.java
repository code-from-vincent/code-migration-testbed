package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class KpiResultEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/governance/187_kpiresult/KpiResult_SQL.xml";
    public HashMap insertKpiResult(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KpiResultEJBDAO.InsertKpiResult", param);
    }
    public Collection selectKpiResultList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "KpiResultEJBDAO.SelectKpiResultList", param);
    }
    public HashMap selectKpiResultDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KpiResultEJBDAO.SelectKpiResultDetail", param);
    }
    public HashMap updateKpiResult(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KpiResultEJBDAO.UpdateKpiResult", param);
    }
    public HashMap deleteKpiResult(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KpiResultEJBDAO.DeleteKpiResult", param);
    }
}