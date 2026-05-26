package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ProductBean extends DefaultSession {
    private final ProductEJBDAO productEJBDAO = new ProductEJBDAO();
    public HashMap insertProduct(DefaultParameters param) throws DefaultEJBException {
        return productEJBDAO.insertProduct(param);
    }
    public Collection selectProductList(DefaultParameters param) throws DefaultEJBException {
        return productEJBDAO.selectProductList(param);
    }
    public HashMap selectProductDetail(DefaultParameters param) throws DefaultEJBException {
        return productEJBDAO.selectProductDetail(param);
    }
    public HashMap updateProduct(DefaultParameters param) throws DefaultEJBException {
        return productEJBDAO.updateProduct(param);
    }
    public HashMap deleteProduct(DefaultParameters param) throws DefaultEJBException {
        return productEJBDAO.deleteProduct(param);
    }
}