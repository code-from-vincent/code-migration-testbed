package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DashboardLocal extends EJBLocalObject {
    HashMap insertDashboard(DefaultParameters param) throws DefaultEJBException;
    Collection selectDashboardList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDashboardDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDashboard(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDashboard(DefaultParameters param) throws DefaultEJBException;
}