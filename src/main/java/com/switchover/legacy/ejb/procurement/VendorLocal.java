package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface VendorLocal extends EJBLocalObject {
    HashMap insertVendor(DefaultParameters param) throws DefaultEJBException;
    Collection selectVendorList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectVendorDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateVendor(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteVendor(DefaultParameters param) throws DefaultEJBException;
}