package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class AssetEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/product/023_asset/Asset_SQL.xml";
    public HashMap insertAsset(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AssetEJBDAO.InsertAsset", param);
    }
    public Collection selectAssetList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "AssetEJBDAO.SelectAssetList", param);
    }
    public HashMap selectAssetDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AssetEJBDAO.SelectAssetDetail", param);
    }
    public HashMap updateAsset(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AssetEJBDAO.UpdateAsset", param);
    }
    public HashMap deleteAsset(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AssetEJBDAO.DeleteAsset", param);
    }
}