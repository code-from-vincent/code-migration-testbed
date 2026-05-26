package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ProblemRecordLocal extends EJBLocalObject {
    HashMap insertProblemRecord(DefaultParameters param) throws DefaultEJBException;
    Collection selectProblemRecordList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectProblemRecordDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateProblemRecord(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteProblemRecord(DefaultParameters param) throws DefaultEJBException;
}