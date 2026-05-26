package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PayrollEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/029_payroll/Payroll_SQL.xml";
    public HashMap insertPayroll(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PayrollEJBDAO.InsertPayroll", param);
    }
    public Collection selectPayrollList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PayrollEJBDAO.SelectPayrollList", param);
    }
    public HashMap selectPayrollDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PayrollEJBDAO.SelectPayrollDetail", param);
    }
    public HashMap updatePayroll(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PayrollEJBDAO.UpdatePayroll", param);
    }
    public HashMap deletePayroll(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PayrollEJBDAO.DeletePayroll", param);
    }
}