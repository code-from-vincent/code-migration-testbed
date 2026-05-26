package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ExperimentRecordLocal extends EJBLocalObject {
    HashMap insertExperimentRecord(DefaultParameters param) throws DefaultEJBException;
    Collection selectExperimentRecordList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectExperimentRecordDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateExperimentRecord(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteExperimentRecord(DefaultParameters param) throws DefaultEJBException;
}