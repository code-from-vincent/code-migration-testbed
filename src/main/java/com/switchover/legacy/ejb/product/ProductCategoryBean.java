package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ProductCategoryBean extends DefaultSession {
    private final ProductCategoryEJBDAO productCategoryEJBDAO = new ProductCategoryEJBDAO();
    public HashMap insertProductCategory(DefaultParameters param) throws DefaultEJBException {
        return productCategoryEJBDAO.insertProductCategory(param);
    }
    public Collection selectProductCategoryList(DefaultParameters param) throws DefaultEJBException {
        return productCategoryEJBDAO.selectProductCategoryList(param);
    }
    public HashMap selectProductCategoryDetail(DefaultParameters param) throws DefaultEJBException {
        return productCategoryEJBDAO.selectProductCategoryDetail(param);
    }
    public HashMap updateProductCategory(DefaultParameters param) throws DefaultEJBException {
        return productCategoryEJBDAO.updateProductCategory(param);
    }
    public HashMap deleteProductCategory(DefaultParameters param) throws DefaultEJBException {
        return productCategoryEJBDAO.deleteProductCategory(param);
    }
}