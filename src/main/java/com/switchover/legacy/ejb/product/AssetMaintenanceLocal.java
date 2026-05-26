package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface AssetMaintenanceLocal extends EJBLocalObject {
    HashMap insertAssetMaintenance(DefaultParameters param) throws DefaultEJBException;
    Collection selectAssetMaintenanceList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectAssetMaintenanceDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateAssetMaintenance(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteAssetMaintenance(DefaultParameters param) throws DefaultEJBException;
}