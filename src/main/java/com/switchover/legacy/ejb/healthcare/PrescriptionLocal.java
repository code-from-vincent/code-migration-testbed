package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PrescriptionLocal extends EJBLocalObject {
    HashMap insertPrescription(DefaultParameters param) throws DefaultEJBException;
    Collection selectPrescriptionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPrescriptionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePrescription(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePrescription(DefaultParameters param) throws DefaultEJBException;
}