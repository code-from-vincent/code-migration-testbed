package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class KpiDefinitionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/governance/186_kpidefinition/KpiDefinition_SQL.xml";
    public HashMap insertKpiDefinition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KpiDefinitionEJBDAO.InsertKpiDefinition", param);
    }
    public Collection selectKpiDefinitionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "KpiDefinitionEJBDAO.SelectKpiDefinitionList", param);
    }
    public HashMap selectKpiDefinitionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KpiDefinitionEJBDAO.SelectKpiDefinitionDetail", param);
    }
    public HashMap updateKpiDefinition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KpiDefinitionEJBDAO.UpdateKpiDefinition", param);
    }
    public HashMap deleteKpiDefinition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KpiDefinitionEJBDAO.DeleteKpiDefinition", param);
    }
}