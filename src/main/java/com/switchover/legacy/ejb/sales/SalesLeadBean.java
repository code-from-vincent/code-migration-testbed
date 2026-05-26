package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SalesLeadBean extends DefaultSession {
    private final SalesLeadEJBDAO salesLeadEJBDAO = new SalesLeadEJBDAO();
    public HashMap insertSalesLead(DefaultParameters param) throws DefaultEJBException {
        return salesLeadEJBDAO.insertSalesLead(param);
    }
    public Collection selectSalesLeadList(DefaultParameters param) throws DefaultEJBException {
        return salesLeadEJBDAO.selectSalesLeadList(param);
    }
    public HashMap selectSalesLeadDetail(DefaultParameters param) throws DefaultEJBException {
        return salesLeadEJBDAO.selectSalesLeadDetail(param);
    }
    public HashMap updateSalesLead(DefaultParameters param) throws DefaultEJBException {
        return salesLeadEJBDAO.updateSalesLead(param);
    }
    public HashMap deleteSalesLead(DefaultParameters param) throws DefaultEJBException {
        return salesLeadEJBDAO.deleteSalesLead(param);
    }
}