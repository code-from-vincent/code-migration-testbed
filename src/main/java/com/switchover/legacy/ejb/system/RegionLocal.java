package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface RegionLocal extends EJBLocalObject {
    HashMap insertRegion(DefaultParameters param) throws DefaultEJBException;
    Collection selectRegionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectRegionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateRegion(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteRegion(DefaultParameters param) throws DefaultEJBException;
}