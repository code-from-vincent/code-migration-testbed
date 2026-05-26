package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface MergerAcquisitionLocal extends EJBLocalObject {
    HashMap insertMergerAcquisition(DefaultParameters param) throws DefaultEJBException;
    Collection selectMergerAcquisitionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectMergerAcquisitionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateMergerAcquisition(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteMergerAcquisition(DefaultParameters param) throws DefaultEJBException;
}