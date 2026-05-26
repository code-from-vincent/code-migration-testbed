package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class InvoiceEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/019_invoice/Invoice_SQL.xml";
    public HashMap insertInvoice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InvoiceEJBDAO.InsertInvoice", param);
    }
    public Collection selectInvoiceList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "InvoiceEJBDAO.SelectInvoiceList", param);
    }
    public HashMap selectInvoiceDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InvoiceEJBDAO.SelectInvoiceDetail", param);
    }
    public HashMap updateInvoice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InvoiceEJBDAO.UpdateInvoice", param);
    }
    public HashMap deleteInvoice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InvoiceEJBDAO.DeleteInvoice", param);
    }
}