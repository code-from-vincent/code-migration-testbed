package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ExpenseReportEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/022_expensereport/ExpenseReport_SQL.xml";
    public HashMap insertExpenseReport(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExpenseReportEJBDAO.InsertExpenseReport", param);
    }
    public Collection selectExpenseReportList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ExpenseReportEJBDAO.SelectExpenseReportList", param);
    }
    public HashMap selectExpenseReportDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExpenseReportEJBDAO.SelectExpenseReportDetail", param);
    }
    public HashMap updateExpenseReport(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExpenseReportEJBDAO.UpdateExpenseReport", param);
    }
    public HashMap deleteExpenseReport(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExpenseReportEJBDAO.DeleteExpenseReport", param);
    }
}