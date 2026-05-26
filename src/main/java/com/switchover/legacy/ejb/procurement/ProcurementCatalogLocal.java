package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ProcurementCatalogLocal extends EJBLocalObject {
    HashMap insertProcurementCatalog(DefaultParameters param) throws DefaultEJBException;
    Collection selectProcurementCatalogList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectProcurementCatalogDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateProcurementCatalog(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteProcurementCatalog(DefaultParameters param) throws DefaultEJBException;
}