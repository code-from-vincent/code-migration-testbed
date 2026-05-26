package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ReportDefinitionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/report/078_reportdefinition/ReportDefinition_SQL.xml";
    public HashMap insertReportDefinition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReportDefinitionEJBDAO.InsertReportDefinition", param);
    }
    public Collection selectReportDefinitionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ReportDefinitionEJBDAO.SelectReportDefinitionList", param);
    }
    public HashMap selectReportDefinitionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReportDefinitionEJBDAO.SelectReportDefinitionDetail", param);
    }
    public HashMap updateReportDefinition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReportDefinitionEJBDAO.UpdateReportDefinition", param);
    }
    public HashMap deleteReportDefinition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReportDefinitionEJBDAO.DeleteReportDefinition", param);
    }
}