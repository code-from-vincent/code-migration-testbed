package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface AssetLocal extends EJBLocalObject {
    HashMap insertAsset(DefaultParameters param) throws DefaultEJBException;
    Collection selectAssetList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectAssetDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateAsset(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteAsset(DefaultParameters param) throws DefaultEJBException;
}