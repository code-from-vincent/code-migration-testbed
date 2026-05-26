package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ProcurementBidLocal extends EJBLocalObject {
    HashMap insertProcurementBid(DefaultParameters param) throws DefaultEJBException;
    Collection selectProcurementBidList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectProcurementBidDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateProcurementBid(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteProcurementBid(DefaultParameters param) throws DefaultEJBException;
}