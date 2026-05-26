package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface TaxInvoiceLocal extends EJBLocalObject {
    HashMap insertTaxInvoice(DefaultParameters param) throws DefaultEJBException;
    Collection selectTaxInvoiceList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectTaxInvoiceDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateTaxInvoice(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteTaxInvoice(DefaultParameters param) throws DefaultEJBException;
}