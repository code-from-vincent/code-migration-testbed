package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ServiceCatalogBean extends DefaultSession {
    private final ServiceCatalogEJBDAO serviceCatalogEJBDAO = new ServiceCatalogEJBDAO();
    public HashMap insertServiceCatalog(DefaultParameters param) throws DefaultEJBException {
        return serviceCatalogEJBDAO.insertServiceCatalog(param);
    }
    public Collection selectServiceCatalogList(DefaultParameters param) throws DefaultEJBException {
        return serviceCatalogEJBDAO.selectServiceCatalogList(param);
    }
    public HashMap selectServiceCatalogDetail(DefaultParameters param) throws DefaultEJBException {
        return serviceCatalogEJBDAO.selectServiceCatalogDetail(param);
    }
    public HashMap updateServiceCatalog(DefaultParameters param) throws DefaultEJBException {
        return serviceCatalogEJBDAO.updateServiceCatalog(param);
    }
    public HashMap deleteServiceCatalog(DefaultParameters param) throws DefaultEJBException {
        return serviceCatalogEJBDAO.deleteServiceCatalog(param);
    }
}