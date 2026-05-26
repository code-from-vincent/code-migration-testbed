package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class TaxInvoiceBean extends DefaultSession {
    private final TaxInvoiceEJBDAO taxInvoiceEJBDAO = new TaxInvoiceEJBDAO();
    public HashMap insertTaxInvoice(DefaultParameters param) throws DefaultEJBException {
        return taxInvoiceEJBDAO.insertTaxInvoice(param);
    }
    public Collection selectTaxInvoiceList(DefaultParameters param) throws DefaultEJBException {
        return taxInvoiceEJBDAO.selectTaxInvoiceList(param);
    }
    public HashMap selectTaxInvoiceDetail(DefaultParameters param) throws DefaultEJBException {
        return taxInvoiceEJBDAO.selectTaxInvoiceDetail(param);
    }
    public HashMap updateTaxInvoice(DefaultParameters param) throws DefaultEJBException {
        return taxInvoiceEJBDAO.updateTaxInvoice(param);
    }
    public HashMap deleteTaxInvoice(DefaultParameters param) throws DefaultEJBException {
        return taxInvoiceEJBDAO.deleteTaxInvoice(param);
    }
}