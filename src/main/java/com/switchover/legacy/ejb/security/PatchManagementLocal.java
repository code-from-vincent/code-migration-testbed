package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PatchManagementLocal extends EJBLocalObject {
    HashMap insertPatchManagement(DefaultParameters param) throws DefaultEJBException;
    Collection selectPatchManagementList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPatchManagementDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePatchManagement(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePatchManagement(DefaultParameters param) throws DefaultEJBException;
}