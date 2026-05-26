package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SystemConfigLocal extends EJBLocalObject {
    HashMap insertSystemConfig(DefaultParameters param) throws DefaultEJBException;
    Collection selectSystemConfigList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSystemConfigDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSystemConfig(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSystemConfig(DefaultParameters param) throws DefaultEJBException;
}