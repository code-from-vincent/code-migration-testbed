package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PartnerBean extends DefaultSession {
    private final PartnerEJBDAO partnerEJBDAO = new PartnerEJBDAO();
    public HashMap insertPartner(DefaultParameters param) throws DefaultEJBException {
        return partnerEJBDAO.insertPartner(param);
    }
    public Collection selectPartnerList(DefaultParameters param) throws DefaultEJBException {
        return partnerEJBDAO.selectPartnerList(param);
    }
    public HashMap selectPartnerDetail(DefaultParameters param) throws DefaultEJBException {
        return partnerEJBDAO.selectPartnerDetail(param);
    }
    public HashMap updatePartner(DefaultParameters param) throws DefaultEJBException {
        return partnerEJBDAO.updatePartner(param);
    }
    public HashMap deletePartner(DefaultParameters param) throws DefaultEJBException {
        return partnerEJBDAO.deletePartner(param);
    }
}