package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface StoreLocal extends EJBLocalObject {
    HashMap insertStore(DefaultParameters param) throws DefaultEJBException;
    Collection selectStoreList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectStoreDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateStore(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteStore(DefaultParameters param) throws DefaultEJBException;
}