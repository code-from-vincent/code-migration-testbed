package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class TaxRateEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/108_taxrate/TaxRate_SQL.xml";
    public HashMap insertTaxRate(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TaxRateEJBDAO.InsertTaxRate", param);
    }
    public Collection selectTaxRateList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "TaxRateEJBDAO.SelectTaxRateList", param);
    }
    public HashMap selectTaxRateDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TaxRateEJBDAO.SelectTaxRateDetail", param);
    }
    public HashMap updateTaxRate(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TaxRateEJBDAO.UpdateTaxRate", param);
    }
    public HashMap deleteTaxRate(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TaxRateEJBDAO.DeleteTaxRate", param);
    }
}