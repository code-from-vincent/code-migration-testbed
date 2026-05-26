package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PatchManagementBean extends DefaultSession {
    private final PatchManagementEJBDAO patchManagementEJBDAO = new PatchManagementEJBDAO();
    public HashMap insertPatchManagement(DefaultParameters param) throws DefaultEJBException {
        return patchManagementEJBDAO.insertPatchManagement(param);
    }
    public Collection selectPatchManagementList(DefaultParameters param) throws DefaultEJBException {
        return patchManagementEJBDAO.selectPatchManagementList(param);
    }
    public HashMap selectPatchManagementDetail(DefaultParameters param) throws DefaultEJBException {
        return patchManagementEJBDAO.selectPatchManagementDetail(param);
    }
    public HashMap updatePatchManagement(DefaultParameters param) throws DefaultEJBException {
        return patchManagementEJBDAO.updatePatchManagement(param);
    }
    public HashMap deletePatchManagement(DefaultParameters param) throws DefaultEJBException {
        return patchManagementEJBDAO.deletePatchManagement(param);
    }
}