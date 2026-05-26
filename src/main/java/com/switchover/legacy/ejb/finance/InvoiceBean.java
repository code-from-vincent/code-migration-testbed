package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class InvoiceBean extends DefaultSession {
    private final InvoiceEJBDAO invoiceEJBDAO = new InvoiceEJBDAO();
    public HashMap insertInvoice(DefaultParameters param) throws DefaultEJBException {
        return invoiceEJBDAO.insertInvoice(param);
    }
    public Collection selectInvoiceList(DefaultParameters param) throws DefaultEJBException {
        return invoiceEJBDAO.selectInvoiceList(param);
    }
    public HashMap selectInvoiceDetail(DefaultParameters param) throws DefaultEJBException {
        return invoiceEJBDAO.selectInvoiceDetail(param);
    }
    public HashMap updateInvoice(DefaultParameters param) throws DefaultEJBException {
        return invoiceEJBDAO.updateInvoice(param);
    }
    public HashMap deleteInvoice(DefaultParameters param) throws DefaultEJBException {
        return invoiceEJBDAO.deleteInvoice(param);
    }
}