package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CostCenterBean extends DefaultSession {
    private final CostCenterEJBDAO costCenterEJBDAO = new CostCenterEJBDAO();
    public HashMap insertCostCenter(DefaultParameters param) throws DefaultEJBException {
        return costCenterEJBDAO.insertCostCenter(param);
    }
    public Collection selectCostCenterList(DefaultParameters param) throws DefaultEJBException {
        return costCenterEJBDAO.selectCostCenterList(param);
    }
    public HashMap selectCostCenterDetail(DefaultParameters param) throws DefaultEJBException {
        return costCenterEJBDAO.selectCostCenterDetail(param);
    }
    public HashMap updateCostCenter(DefaultParameters param) throws DefaultEJBException {
        return costCenterEJBDAO.updateCostCenter(param);
    }
    public HashMap deleteCostCenter(DefaultParameters param) throws DefaultEJBException {
        return costCenterEJBDAO.deleteCostCenter(param);
    }
}