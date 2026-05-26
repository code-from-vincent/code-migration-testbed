package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SampleInventoryLocal extends EJBLocalObject {
    HashMap insertSampleInventory(DefaultParameters param) throws DefaultEJBException;
    Collection selectSampleInventoryList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSampleInventoryDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSampleInventory(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSampleInventory(DefaultParameters param) throws DefaultEJBException;
}