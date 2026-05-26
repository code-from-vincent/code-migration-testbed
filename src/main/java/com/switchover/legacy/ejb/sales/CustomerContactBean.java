package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CustomerContactBean extends DefaultSession {
    private final CustomerContactEJBDAO customerContactEJBDAO = new CustomerContactEJBDAO();
    public HashMap insertCustomerContact(DefaultParameters param) throws DefaultEJBException {
        return customerContactEJBDAO.insertCustomerContact(param);
    }
    public Collection selectCustomerContactList(DefaultParameters param) throws DefaultEJBException {
        return customerContactEJBDAO.selectCustomerContactList(param);
    }
    public HashMap selectCustomerContactDetail(DefaultParameters param) throws DefaultEJBException {
        return customerContactEJBDAO.selectCustomerContactDetail(param);
    }
    public HashMap updateCustomerContact(DefaultParameters param) throws DefaultEJBException {
        return customerContactEJBDAO.updateCustomerContact(param);
    }
    public HashMap deleteCustomerContact(DefaultParameters param) throws DefaultEJBException {
        return customerContactEJBDAO.deleteCustomerContact(param);
    }
}