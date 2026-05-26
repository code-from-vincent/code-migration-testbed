package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ExpenseReportBean extends DefaultSession {
    private final ExpenseReportEJBDAO expenseReportEJBDAO = new ExpenseReportEJBDAO();
    public HashMap insertExpenseReport(DefaultParameters param) throws DefaultEJBException {
        return expenseReportEJBDAO.insertExpenseReport(param);
    }
    public Collection selectExpenseReportList(DefaultParameters param) throws DefaultEJBException {
        return expenseReportEJBDAO.selectExpenseReportList(param);
    }
    public HashMap selectExpenseReportDetail(DefaultParameters param) throws DefaultEJBException {
        return expenseReportEJBDAO.selectExpenseReportDetail(param);
    }
    public HashMap updateExpenseReport(DefaultParameters param) throws DefaultEJBException {
        return expenseReportEJBDAO.updateExpenseReport(param);
    }
    public HashMap deleteExpenseReport(DefaultParameters param) throws DefaultEJBException {
        return expenseReportEJBDAO.deleteExpenseReport(param);
    }
}