package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DepartmentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/system/003_department/Department_SQL.xml";
    public HashMap insertDepartment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DepartmentEJBDAO.InsertDepartment", param);
    }
    public Collection selectDepartmentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DepartmentEJBDAO.SelectDepartmentList", param);
    }
    public HashMap selectDepartmentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DepartmentEJBDAO.SelectDepartmentDetail", param);
    }
    public HashMap updateDepartment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DepartmentEJBDAO.UpdateDepartment", param);
    }
    public HashMap deleteDepartment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DepartmentEJBDAO.DeleteDepartment", param);
    }
}