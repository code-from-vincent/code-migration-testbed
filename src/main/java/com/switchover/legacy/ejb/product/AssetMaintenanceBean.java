package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class AssetMaintenanceBean extends DefaultSession {
    private final AssetMaintenanceEJBDAO assetMaintenanceEJBDAO = new AssetMaintenanceEJBDAO();
    public HashMap insertAssetMaintenance(DefaultParameters param) throws DefaultEJBException {
        return assetMaintenanceEJBDAO.insertAssetMaintenance(param);
    }
    public Collection selectAssetMaintenanceList(DefaultParameters param) throws DefaultEJBException {
        return assetMaintenanceEJBDAO.selectAssetMaintenanceList(param);
    }
    public HashMap selectAssetMaintenanceDetail(DefaultParameters param) throws DefaultEJBException {
        return assetMaintenanceEJBDAO.selectAssetMaintenanceDetail(param);
    }
    public HashMap updateAssetMaintenance(DefaultParameters param) throws DefaultEJBException {
        return assetMaintenanceEJBDAO.updateAssetMaintenance(param);
    }
    public HashMap deleteAssetMaintenance(DefaultParameters param) throws DefaultEJBException {
        return assetMaintenanceEJBDAO.deleteAssetMaintenance(param);
    }
}