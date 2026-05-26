package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class TaxInvoiceEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/107_taxinvoice/TaxInvoice_SQL.xml";
    public HashMap insertTaxInvoice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TaxInvoiceEJBDAO.InsertTaxInvoice", param);
    }
    public Collection selectTaxInvoiceList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "TaxInvoiceEJBDAO.SelectTaxInvoiceList", param);
    }
    public HashMap selectTaxInvoiceDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TaxInvoiceEJBDAO.SelectTaxInvoiceDetail", param);
    }
    public HashMap updateTaxInvoice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TaxInvoiceEJBDAO.UpdateTaxInvoice", param);
    }
    public HashMap deleteTaxInvoice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TaxInvoiceEJBDAO.DeleteTaxInvoice", param);
    }
}