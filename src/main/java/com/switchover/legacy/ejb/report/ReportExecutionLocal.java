package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ReportExecutionLocal extends EJBLocalObject {
    HashMap insertReportExecution(DefaultParameters param) throws DefaultEJBException;
    Collection selectReportExecutionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectReportExecutionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateReportExecution(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteReportExecution(DefaultParameters param) throws DefaultEJBException;
}