package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class VendorEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/procurement/016_vendor/Vendor_SQL.xml";
    public HashMap insertVendor(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VendorEJBDAO.InsertVendor", param);
    }
    public Collection selectVendorList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "VendorEJBDAO.SelectVendorList", param);
    }
    public HashMap selectVendorDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VendorEJBDAO.SelectVendorDetail", param);
    }
    public HashMap updateVendor(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VendorEJBDAO.UpdateVendor", param);
    }
    public HashMap deleteVendor(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VendorEJBDAO.DeleteVendor", param);
    }
}