package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CustomerBean extends DefaultSession {
    private final CustomerEJBDAO customerEJBDAO = new CustomerEJBDAO();
    public HashMap insertCustomer(DefaultParameters param) throws DefaultEJBException {
        return customerEJBDAO.insertCustomer(param);
    }
    public Collection selectCustomerList(DefaultParameters param) throws DefaultEJBException {
        return customerEJBDAO.selectCustomerList(param);
    }
    public HashMap selectCustomerDetail(DefaultParameters param) throws DefaultEJBException {
        return customerEJBDAO.selectCustomerDetail(param);
    }
    public HashMap updateCustomer(DefaultParameters param) throws DefaultEJBException {
        return customerEJBDAO.updateCustomer(param);
    }
    public HashMap deleteCustomer(DefaultParameters param) throws DefaultEJBException {
        return customerEJBDAO.deleteCustomer(param);
    }
}