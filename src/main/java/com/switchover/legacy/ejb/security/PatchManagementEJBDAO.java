package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PatchManagementEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/security/156_patchmanagement/PatchManagement_SQL.xml";
    public HashMap insertPatchManagement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatchManagementEJBDAO.InsertPatchManagement", param);
    }
    public Collection selectPatchManagementList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PatchManagementEJBDAO.SelectPatchManagementList", param);
    }
    public HashMap selectPatchManagementDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatchManagementEJBDAO.SelectPatchManagementDetail", param);
    }
    public HashMap updatePatchManagement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatchManagementEJBDAO.UpdatePatchManagement", param);
    }
    public HashMap deletePatchManagement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatchManagementEJBDAO.DeletePatchManagement", param);
    }
}