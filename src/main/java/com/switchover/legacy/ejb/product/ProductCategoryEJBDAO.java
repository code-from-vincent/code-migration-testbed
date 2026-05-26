package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ProductCategoryEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/product/042_productcategory/ProductCategory_SQL.xml";
    public HashMap insertProductCategory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductCategoryEJBDAO.InsertProductCategory", param);
    }
    public Collection selectProductCategoryList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ProductCategoryEJBDAO.SelectProductCategoryList", param);
    }
    public HashMap selectProductCategoryDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductCategoryEJBDAO.SelectProductCategoryDetail", param);
    }
    public HashMap updateProductCategory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductCategoryEJBDAO.UpdateProductCategory", param);
    }
    public HashMap deleteProductCategory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductCategoryEJBDAO.DeleteProductCategory", param);
    }
}