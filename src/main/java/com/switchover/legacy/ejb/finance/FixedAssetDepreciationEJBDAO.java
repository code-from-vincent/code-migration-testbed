package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class FixedAssetDepreciationEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/118_fixedassetdepreciation/FixedAssetDepreciation_SQL.xml";
    public HashMap insertFixedAssetDepreciation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FixedAssetDepreciationEJBDAO.InsertFixedAssetDepreciation", param);
    }
    public Collection selectFixedAssetDepreciationList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "FixedAssetDepreciationEJBDAO.SelectFixedAssetDepreciationList", param);
    }
    public HashMap selectFixedAssetDepreciationDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FixedAssetDepreciationEJBDAO.SelectFixedAssetDepreciationDetail", param);
    }
    public HashMap updateFixedAssetDepreciation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FixedAssetDepreciationEJBDAO.UpdateFixedAssetDepreciation", param);
    }
    public HashMap deleteFixedAssetDepreciation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FixedAssetDepreciationEJBDAO.DeleteFixedAssetDepreciation", param);
    }
}