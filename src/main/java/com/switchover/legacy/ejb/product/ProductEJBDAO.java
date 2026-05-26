package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ProductEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/product/041_product/Product_SQL.xml";
    public HashMap insertProduct(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductEJBDAO.InsertProduct", param);
    }
    public Collection selectProductList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ProductEJBDAO.SelectProductList", param);
    }
    public HashMap selectProductDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductEJBDAO.SelectProductDetail", param);
    }
    public HashMap updateProduct(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductEJBDAO.UpdateProduct", param);
    }
    public HashMap deleteProduct(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductEJBDAO.DeleteProduct", param);
    }
}