package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class BillOfMaterialEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/manufacturing/051_billofmaterial/BillOfMaterial_SQL.xml";
    public HashMap insertBillOfMaterial(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BillOfMaterialEJBDAO.InsertBillOfMaterial", param);
    }
    public Collection selectBillOfMaterialList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "BillOfMaterialEJBDAO.SelectBillOfMaterialList", param);
    }
    public HashMap selectBillOfMaterialDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BillOfMaterialEJBDAO.SelectBillOfMaterialDetail", param);
    }
    public HashMap updateBillOfMaterial(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BillOfMaterialEJBDAO.UpdateBillOfMaterial", param);
    }
    public HashMap deleteBillOfMaterial(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BillOfMaterialEJBDAO.DeleteBillOfMaterial", param);
    }
}