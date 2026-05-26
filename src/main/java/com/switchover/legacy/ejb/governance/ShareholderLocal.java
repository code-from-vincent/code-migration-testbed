package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ShareholderLocal extends EJBLocalObject {
    HashMap insertShareholder(DefaultParameters param) throws DefaultEJBException;
    Collection selectShareholderList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectShareholderDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateShareholder(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteShareholder(DefaultParameters param) throws DefaultEJBException;
}