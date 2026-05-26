package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface FixedAssetDepreciationLocalHome extends EJBLocalHome {
    FixedAssetDepreciationLocal create() throws CreateException;
}