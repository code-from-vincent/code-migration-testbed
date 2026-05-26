package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class EmployeeProfileEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/004_employeeprofile/EmployeeProfile_SQL.xml";
    public HashMap insertEmployeeProfile(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EmployeeProfileEJBDAO.InsertEmployeeProfile", param);
    }
    public Collection selectEmployeeProfileList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "EmployeeProfileEJBDAO.SelectEmployeeProfileList", param);
    }
    public HashMap selectEmployeeProfileDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EmployeeProfileEJBDAO.SelectEmployeeProfileDetail", param);
    }
    public HashMap updateEmployeeProfile(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EmployeeProfileEJBDAO.UpdateEmployeeProfile", param);
    }
    public HashMap deleteEmployeeProfile(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EmployeeProfileEJBDAO.DeleteEmployeeProfile", param);
    }
}