package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CustomerEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/sales/034_customer/Customer_SQL.xml";
    public HashMap insertCustomer(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CustomerEJBDAO.InsertCustomer", param);
    }
    public Collection selectCustomerList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CustomerEJBDAO.SelectCustomerList", param);
    }
    public HashMap selectCustomerDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CustomerEJBDAO.SelectCustomerDetail", param);
    }
    public HashMap updateCustomer(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CustomerEJBDAO.UpdateCustomer", param);
    }
    public HashMap deleteCustomer(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CustomerEJBDAO.DeleteCustomer", param);
    }
}