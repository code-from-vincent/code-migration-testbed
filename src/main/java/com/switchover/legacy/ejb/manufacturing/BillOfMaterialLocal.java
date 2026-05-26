package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface BillOfMaterialLocal extends EJBLocalObject {
    HashMap insertBillOfMaterial(DefaultParameters param) throws DefaultEJBException;
    Collection selectBillOfMaterialList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectBillOfMaterialDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateBillOfMaterial(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteBillOfMaterial(DefaultParameters param) throws DefaultEJBException;
}