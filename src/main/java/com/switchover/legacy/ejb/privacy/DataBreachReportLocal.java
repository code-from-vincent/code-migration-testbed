package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DataBreachReportLocal extends EJBLocalObject {
    HashMap insertDataBreachReport(DefaultParameters param) throws DefaultEJBException;
    Collection selectDataBreachReportList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDataBreachReportDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDataBreachReport(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDataBreachReport(DefaultParameters param) throws DefaultEJBException;
}