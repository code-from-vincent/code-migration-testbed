package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SalesLeadLocal extends EJBLocalObject {
    HashMap insertSalesLead(DefaultParameters param) throws DefaultEJBException;
    Collection selectSalesLeadList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSalesLeadDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSalesLead(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSalesLead(DefaultParameters param) throws DefaultEJBException;
}