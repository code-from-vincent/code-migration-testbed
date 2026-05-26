package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface InvoiceLocal extends EJBLocalObject {
    HashMap insertInvoice(DefaultParameters param) throws DefaultEJBException;
    Collection selectInvoiceList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectInvoiceDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateInvoice(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteInvoice(DefaultParameters param) throws DefaultEJBException;
}