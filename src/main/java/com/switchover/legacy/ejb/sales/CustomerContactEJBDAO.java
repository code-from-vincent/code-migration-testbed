package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CustomerContactEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/sales/035_customercontact/CustomerContact_SQL.xml";
    public HashMap insertCustomerContact(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CustomerContactEJBDAO.InsertCustomerContact", param);
    }
    public Collection selectCustomerContactList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CustomerContactEJBDAO.SelectCustomerContactList", param);
    }
    public HashMap selectCustomerContactDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CustomerContactEJBDAO.SelectCustomerContactDetail", param);
    }
    public HashMap updateCustomerContact(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CustomerContactEJBDAO.UpdateCustomerContact", param);
    }
    public HashMap deleteCustomerContact(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CustomerContactEJBDAO.DeleteCustomerContact", param);
    }
}