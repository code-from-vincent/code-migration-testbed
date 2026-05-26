package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class FixedAssetDepreciationBean extends DefaultSession {
    private final FixedAssetDepreciationEJBDAO fixedAssetDepreciationEJBDAO = new FixedAssetDepreciationEJBDAO();
    public HashMap insertFixedAssetDepreciation(DefaultParameters param) throws DefaultEJBException {
        return fixedAssetDepreciationEJBDAO.insertFixedAssetDepreciation(param);
    }
    public Collection selectFixedAssetDepreciationList(DefaultParameters param) throws DefaultEJBException {
        return fixedAssetDepreciationEJBDAO.selectFixedAssetDepreciationList(param);
    }
    public HashMap selectFixedAssetDepreciationDetail(DefaultParameters param) throws DefaultEJBException {
        return fixedAssetDepreciationEJBDAO.selectFixedAssetDepreciationDetail(param);
    }
    public HashMap updateFixedAssetDepreciation(DefaultParameters param) throws DefaultEJBException {
        return fixedAssetDepreciationEJBDAO.updateFixedAssetDepreciation(param);
    }
    public HashMap deleteFixedAssetDepreciation(DefaultParameters param) throws DefaultEJBException {
        return fixedAssetDepreciationEJBDAO.deleteFixedAssetDepreciation(param);
    }
}