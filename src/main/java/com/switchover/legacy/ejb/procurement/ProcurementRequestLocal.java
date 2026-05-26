package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ProcurementRequestLocal extends EJBLocalObject {
    HashMap insertProcurementRequest(DefaultParameters param) throws DefaultEJBException;
    Collection selectProcurementRequestList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectProcurementRequestDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateProcurementRequest(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteProcurementRequest(DefaultParameters param) throws DefaultEJBException;
}