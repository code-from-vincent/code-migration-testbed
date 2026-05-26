package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ReportExecutionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/report/079_reportexecution/ReportExecution_SQL.xml";
    public HashMap insertReportExecution(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReportExecutionEJBDAO.InsertReportExecution", param);
    }
    public Collection selectReportExecutionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ReportExecutionEJBDAO.SelectReportExecutionList", param);
    }
    public HashMap selectReportExecutionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReportExecutionEJBDAO.SelectReportExecutionDetail", param);
    }
    public HashMap updateReportExecution(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReportExecutionEJBDAO.UpdateReportExecution", param);
    }
    public HashMap deleteReportExecution(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReportExecutionEJBDAO.DeleteReportExecution", param);
    }
}