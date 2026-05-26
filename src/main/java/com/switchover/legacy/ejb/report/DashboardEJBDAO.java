package com.switchover.legacy.ejb.report;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DashboardEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/report/077_dashboard/Dashboard_SQL.xml";
    public HashMap insertDashboard(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DashboardEJBDAO.InsertDashboard", param);
    }
    public Collection selectDashboardList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DashboardEJBDAO.SelectDashboardList", param);
    }
    public HashMap selectDashboardDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DashboardEJBDAO.SelectDashboardDetail", param);
    }
    public HashMap updateDashboard(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DashboardEJBDAO.UpdateDashboard", param);
    }
    public HashMap deleteDashboard(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DashboardEJBDAO.DeleteDashboard", param);
    }
}