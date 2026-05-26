package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class BranchOfficeEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/facility/087_branchoffice/BranchOffice_SQL.xml";
    public HashMap insertBranchOffice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BranchOfficeEJBDAO.InsertBranchOffice", param);
    }
    public Collection selectBranchOfficeList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "BranchOfficeEJBDAO.SelectBranchOfficeList", param);
    }
    public HashMap selectBranchOfficeDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BranchOfficeEJBDAO.SelectBranchOfficeDetail", param);
    }
    public HashMap updateBranchOffice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BranchOfficeEJBDAO.UpdateBranchOffice", param);
    }
    public HashMap deleteBranchOffice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BranchOfficeEJBDAO.DeleteBranchOffice", param);
    }
}