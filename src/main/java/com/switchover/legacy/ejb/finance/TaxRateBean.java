package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class TaxRateBean extends DefaultSession {
    private final TaxRateEJBDAO taxRateEJBDAO = new TaxRateEJBDAO();
    public HashMap insertTaxRate(DefaultParameters param) throws DefaultEJBException {
        return taxRateEJBDAO.insertTaxRate(param);
    }
    public Collection selectTaxRateList(DefaultParameters param) throws DefaultEJBException {
        return taxRateEJBDAO.selectTaxRateList(param);
    }
    public HashMap selectTaxRateDetail(DefaultParameters param) throws DefaultEJBException {
        return taxRateEJBDAO.selectTaxRateDetail(param);
    }
    public HashMap updateTaxRate(DefaultParameters param) throws DefaultEJBException {
        return taxRateEJBDAO.updateTaxRate(param);
    }
    public HashMap deleteTaxRate(DefaultParameters param) throws DefaultEJBException {
        return taxRateEJBDAO.deleteTaxRate(param);
    }
}