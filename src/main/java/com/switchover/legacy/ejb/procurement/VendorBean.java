package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class VendorBean extends DefaultSession {
    private final VendorEJBDAO vendorEJBDAO = new VendorEJBDAO();
    public HashMap insertVendor(DefaultParameters param) throws DefaultEJBException {
        return vendorEJBDAO.insertVendor(param);
    }
    public Collection selectVendorList(DefaultParameters param) throws DefaultEJBException {
        return vendorEJBDAO.selectVendorList(param);
    }
    public HashMap selectVendorDetail(DefaultParameters param) throws DefaultEJBException {
        return vendorEJBDAO.selectVendorDetail(param);
    }
    public HashMap updateVendor(DefaultParameters param) throws DefaultEJBException {
        return vendorEJBDAO.updateVendor(param);
    }
    public HashMap deleteVendor(DefaultParameters param) throws DefaultEJBException {
        return vendorEJBDAO.deleteVendor(param);
    }
}