package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ConfigurationItemLocal extends EJBLocalObject {
    HashMap insertConfigurationItem(DefaultParameters param) throws DefaultEJBException;
    Collection selectConfigurationItemList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectConfigurationItemDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateConfigurationItem(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteConfigurationItem(DefaultParameters param) throws DefaultEJBException;
}