package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface MedicalClaimLocal extends EJBLocalObject {
    HashMap insertMedicalClaim(DefaultParameters param) throws DefaultEJBException;
    Collection selectMedicalClaimList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectMedicalClaimDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateMedicalClaim(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteMedicalClaim(DefaultParameters param) throws DefaultEJBException;
}