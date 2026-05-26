package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PayrollBean extends DefaultSession {
    private final PayrollEJBDAO payrollEJBDAO = new PayrollEJBDAO();
    public HashMap insertPayroll(DefaultParameters param) throws DefaultEJBException {
        return payrollEJBDAO.insertPayroll(param);
    }
    public Collection selectPayrollList(DefaultParameters param) throws DefaultEJBException {
        return payrollEJBDAO.selectPayrollList(param);
    }
    public HashMap selectPayrollDetail(DefaultParameters param) throws DefaultEJBException {
        return payrollEJBDAO.selectPayrollDetail(param);
    }
    public HashMap updatePayroll(DefaultParameters param) throws DefaultEJBException {
        return payrollEJBDAO.updatePayroll(param);
    }
    public HashMap deletePayroll(DefaultParameters param) throws DefaultEJBException {
        return payrollEJBDAO.deletePayroll(param);
    }
}