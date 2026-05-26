package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface TaxRateLocal extends EJBLocalObject {
    HashMap insertTaxRate(DefaultParameters param) throws DefaultEJBException;
    Collection selectTaxRateList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectTaxRateDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateTaxRate(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteTaxRate(DefaultParameters param) throws DefaultEJBException;
}