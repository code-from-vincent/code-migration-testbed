package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SupplierScorecardBean extends DefaultSession {
    private final SupplierScorecardEJBDAO supplierScorecardEJBDAO = new SupplierScorecardEJBDAO();
    public HashMap insertSupplierScorecard(DefaultParameters param) throws DefaultEJBException {
        return supplierScorecardEJBDAO.insertSupplierScorecard(param);
    }
    public Collection selectSupplierScorecardList(DefaultParameters param) throws DefaultEJBException {
        return supplierScorecardEJBDAO.selectSupplierScorecardList(param);
    }
    public HashMap selectSupplierScorecardDetail(DefaultParameters param) throws DefaultEJBException {
        return supplierScorecardEJBDAO.selectSupplierScorecardDetail(param);
    }
    public HashMap updateSupplierScorecard(DefaultParameters param) throws DefaultEJBException {
        return supplierScorecardEJBDAO.updateSupplierScorecard(param);
    }
    public HashMap deleteSupplierScorecard(DefaultParameters param) throws DefaultEJBException {
        return supplierScorecardEJBDAO.deleteSupplierScorecard(param);
    }
}