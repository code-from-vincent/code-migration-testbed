package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ExpenseReportLocal extends EJBLocalObject {
    HashMap insertExpenseReport(DefaultParameters param) throws DefaultEJBException;
    Collection selectExpenseReportList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectExpenseReportDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateExpenseReport(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteExpenseReport(DefaultParameters param) throws DefaultEJBException;
}