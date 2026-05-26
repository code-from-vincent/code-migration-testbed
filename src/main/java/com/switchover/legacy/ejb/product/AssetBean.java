package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class AssetBean extends DefaultSession {
    private final AssetEJBDAO assetEJBDAO = new AssetEJBDAO();
    public HashMap insertAsset(DefaultParameters param) throws DefaultEJBException {
        return assetEJBDAO.insertAsset(param);
    }
    public Collection selectAssetList(DefaultParameters param) throws DefaultEJBException {
        return assetEJBDAO.selectAssetList(param);
    }
    public HashMap selectAssetDetail(DefaultParameters param) throws DefaultEJBException {
        return assetEJBDAO.selectAssetDetail(param);
    }
    public HashMap updateAsset(DefaultParameters param) throws DefaultEJBException {
        return assetEJBDAO.updateAsset(param);
    }
    public HashMap deleteAsset(DefaultParameters param) throws DefaultEJBException {
        return assetEJBDAO.deleteAsset(param);
    }
}