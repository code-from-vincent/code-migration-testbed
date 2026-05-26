package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PartnerSettlementLocal extends EJBLocalObject {
    HashMap insertPartnerSettlement(DefaultParameters param) throws DefaultEJBException;
    Collection selectPartnerSettlementList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPartnerSettlementDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePartnerSettlement(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePartnerSettlement(DefaultParameters param) throws DefaultEJBException;
}