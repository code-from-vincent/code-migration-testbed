package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ServiceCatalogLocal extends EJBLocalObject {
    HashMap insertServiceCatalog(DefaultParameters param) throws DefaultEJBException;
    Collection selectServiceCatalogList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectServiceCatalogDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateServiceCatalog(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteServiceCatalog(DefaultParameters param) throws DefaultEJBException;
}