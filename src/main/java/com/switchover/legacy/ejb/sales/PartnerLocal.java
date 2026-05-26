package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PartnerLocal extends EJBLocalObject {
    HashMap insertPartner(DefaultParameters param) throws DefaultEJBException;
    Collection selectPartnerList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPartnerDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePartner(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePartner(DefaultParameters param) throws DefaultEJBException;
}