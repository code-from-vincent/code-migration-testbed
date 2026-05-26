package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ProfitCenterBean extends DefaultSession {
    private final ProfitCenterEJBDAO profitCenterEJBDAO = new ProfitCenterEJBDAO();
    public HashMap insertProfitCenter(DefaultParameters param) throws DefaultEJBException {
        return profitCenterEJBDAO.insertProfitCenter(param);
    }
    public Collection selectProfitCenterList(DefaultParameters param) throws DefaultEJBException {
        return profitCenterEJBDAO.selectProfitCenterList(param);
    }
    public HashMap selectProfitCenterDetail(DefaultParameters param) throws DefaultEJBException {
        return profitCenterEJBDAO.selectProfitCenterDetail(param);
    }
    public HashMap updateProfitCenter(DefaultParameters param) throws DefaultEJBException {
        return profitCenterEJBDAO.updateProfitCenter(param);
    }
    public HashMap deleteProfitCenter(DefaultParameters param) throws DefaultEJBException {
        return profitCenterEJBDAO.deleteProfitCenter(param);
    }
}