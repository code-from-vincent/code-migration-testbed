package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface MenuLocal extends EJBLocalObject {
    HashMap insertMenu(DefaultParameters param) throws DefaultEJBException;
    Collection selectMenuList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectMenuDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateMenu(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteMenu(DefaultParameters param) throws DefaultEJBException;
}