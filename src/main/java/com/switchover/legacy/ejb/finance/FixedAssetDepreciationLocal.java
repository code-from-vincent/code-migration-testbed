package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface FixedAssetDepreciationLocal extends EJBLocalObject {
    HashMap insertFixedAssetDepreciation(DefaultParameters param) throws DefaultEJBException;
    Collection selectFixedAssetDepreciationList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectFixedAssetDepreciationDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateFixedAssetDepreciation(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteFixedAssetDepreciation(DefaultParameters param) throws DefaultEJBException;
}