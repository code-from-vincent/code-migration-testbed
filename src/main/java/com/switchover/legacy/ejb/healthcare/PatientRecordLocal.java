package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PatientRecordLocal extends EJBLocalObject {
    HashMap insertPatientRecord(DefaultParameters param) throws DefaultEJBException;
    Collection selectPatientRecordList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPatientRecordDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePatientRecord(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePatientRecord(DefaultParameters param) throws DefaultEJBException;
}