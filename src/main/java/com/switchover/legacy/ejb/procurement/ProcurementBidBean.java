package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ProcurementBidBean extends DefaultSession {
    private final ProcurementBidEJBDAO procurementBidEJBDAO = new ProcurementBidEJBDAO();
    public HashMap insertProcurementBid(DefaultParameters param) throws DefaultEJBException {
        return procurementBidEJBDAO.insertProcurementBid(param);
    }
    public Collection selectProcurementBidList(DefaultParameters param) throws DefaultEJBException {
        return procurementBidEJBDAO.selectProcurementBidList(param);
    }
    public HashMap selectProcurementBidDetail(DefaultParameters param) throws DefaultEJBException {
        return procurementBidEJBDAO.selectProcurementBidDetail(param);
    }
    public HashMap updateProcurementBid(DefaultParameters param) throws DefaultEJBException {
        return procurementBidEJBDAO.updateProcurementBid(param);
    }
    public HashMap deleteProcurementBid(DefaultParameters param) throws DefaultEJBException {
        return procurementBidEJBDAO.deleteProcurementBid(param);
    }
}