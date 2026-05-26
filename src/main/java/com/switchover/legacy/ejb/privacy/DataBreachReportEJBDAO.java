package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DataBreachReportEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/privacy/179_databreachreport/DataBreachReport_SQL.xml";
    public HashMap insertDataBreachReport(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataBreachReportEJBDAO.InsertDataBreachReport", param);
    }
    public Collection selectDataBreachReportList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DataBreachReportEJBDAO.SelectDataBreachReportList", param);
    }
    public HashMap selectDataBreachReportDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataBreachReportEJBDAO.SelectDataBreachReportDetail", param);
    }
    public HashMap updateDataBreachReport(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataBreachReportEJBDAO.UpdateDataBreachReport", param);
    }
    public HashMap deleteDataBreachReport(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataBreachReportEJBDAO.DeleteDataBreachReport", param);
    }
}