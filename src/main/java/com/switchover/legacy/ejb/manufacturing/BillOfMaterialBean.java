package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class BillOfMaterialBean extends DefaultSession {
    private final BillOfMaterialEJBDAO billOfMaterialEJBDAO = new BillOfMaterialEJBDAO();
    public HashMap insertBillOfMaterial(DefaultParameters param) throws DefaultEJBException {
        return billOfMaterialEJBDAO.insertBillOfMaterial(param);
    }
    public Collection selectBillOfMaterialList(DefaultParameters param) throws DefaultEJBException {
        return billOfMaterialEJBDAO.selectBillOfMaterialList(param);
    }
    public HashMap selectBillOfMaterialDetail(DefaultParameters param) throws DefaultEJBException {
        return billOfMaterialEJBDAO.selectBillOfMaterialDetail(param);
    }
    public HashMap updateBillOfMaterial(DefaultParameters param) throws DefaultEJBException {
        return billOfMaterialEJBDAO.updateBillOfMaterial(param);
    }
    public HashMap deleteBillOfMaterial(DefaultParameters param) throws DefaultEJBException {
        return billOfMaterialEJBDAO.deleteBillOfMaterial(param);
    }
}