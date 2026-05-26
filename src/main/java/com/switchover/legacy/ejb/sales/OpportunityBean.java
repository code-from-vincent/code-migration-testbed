package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class OpportunityBean extends DefaultSession {
    private final OpportunityEJBDAO opportunityEJBDAO = new OpportunityEJBDAO();
    public HashMap insertOpportunity(DefaultParameters param) throws DefaultEJBException {
        return opportunityEJBDAO.insertOpportunity(param);
    }
    public Collection selectOpportunityList(DefaultParameters param) throws DefaultEJBException {
        return opportunityEJBDAO.selectOpportunityList(param);
    }
    public HashMap selectOpportunityDetail(DefaultParameters param) throws DefaultEJBException {
        return opportunityEJBDAO.selectOpportunityDetail(param);
    }
    public HashMap updateOpportunity(DefaultParameters param) throws DefaultEJBException {
        return opportunityEJBDAO.updateOpportunity(param);
    }
    public HashMap deleteOpportunity(DefaultParameters param) throws DefaultEJBException {
        return opportunityEJBDAO.deleteOpportunity(param);
    }
}