package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DashboardBean extends DefaultSession {
    private final DashboardEJBDAO dashboardEJBDAO = new DashboardEJBDAO();
    public HashMap insertDashboard(DefaultParameters param) throws DefaultEJBException {
        return dashboardEJBDAO.insertDashboard(param);
    }
    public Collection selectDashboardList(DefaultParameters param) throws DefaultEJBException {
        return dashboardEJBDAO.selectDashboardList(param);
    }
    public HashMap selectDashboardDetail(DefaultParameters param) throws DefaultEJBException {
        return dashboardEJBDAO.selectDashboardDetail(param);
    }
    public HashMap updateDashboard(DefaultParameters param) throws DefaultEJBException {
        return dashboardEJBDAO.updateDashboard(param);
    }
    public HashMap deleteDashboard(DefaultParameters param) throws DefaultEJBException {
        return dashboardEJBDAO.deleteDashboard(param);
    }
}