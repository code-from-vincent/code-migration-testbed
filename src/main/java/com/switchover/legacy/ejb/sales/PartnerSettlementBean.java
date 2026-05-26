package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PartnerSettlementBean extends DefaultSession {
    private final PartnerSettlementEJBDAO partnerSettlementEJBDAO = new PartnerSettlementEJBDAO();
    public HashMap insertPartnerSettlement(DefaultParameters param) throws DefaultEJBException {
        return partnerSettlementEJBDAO.insertPartnerSettlement(param);
    }
    public Collection selectPartnerSettlementList(DefaultParameters param) throws DefaultEJBException {
        return partnerSettlementEJBDAO.selectPartnerSettlementList(param);
    }
    public HashMap selectPartnerSettlementDetail(DefaultParameters param) throws DefaultEJBException {
        return partnerSettlementEJBDAO.selectPartnerSettlementDetail(param);
    }
    public HashMap updatePartnerSettlement(DefaultParameters param) throws DefaultEJBException {
        return partnerSettlementEJBDAO.updatePartnerSettlement(param);
    }
    public HashMap deletePartnerSettlement(DefaultParameters param) throws DefaultEJBException {
        return partnerSettlementEJBDAO.deletePartnerSettlement(param);
    }
}