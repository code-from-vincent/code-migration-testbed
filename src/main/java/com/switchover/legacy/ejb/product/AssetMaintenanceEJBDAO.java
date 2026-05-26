package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class AssetMaintenanceEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/product/024_assetmaintenance/AssetMaintenance_SQL.xml";
    public HashMap insertAssetMaintenance(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AssetMaintenanceEJBDAO.InsertAssetMaintenance", param);
    }
    public Collection selectAssetMaintenanceList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "AssetMaintenanceEJBDAO.SelectAssetMaintenanceList", param);
    }
    public HashMap selectAssetMaintenanceDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AssetMaintenanceEJBDAO.SelectAssetMaintenanceDetail", param);
    }
    public HashMap updateAssetMaintenance(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AssetMaintenanceEJBDAO.UpdateAssetMaintenance", param);
    }
    public HashMap deleteAssetMaintenance(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AssetMaintenanceEJBDAO.DeleteAssetMaintenance", param);
    }
}