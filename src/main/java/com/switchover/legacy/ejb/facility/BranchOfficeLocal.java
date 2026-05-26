package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface BranchOfficeLocal extends EJBLocalObject {
    HashMap insertBranchOffice(DefaultParameters param) throws DefaultEJBException;
    Collection selectBranchOfficeList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectBranchOfficeDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateBranchOffice(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteBranchOffice(DefaultParameters param) throws DefaultEJBException;
}