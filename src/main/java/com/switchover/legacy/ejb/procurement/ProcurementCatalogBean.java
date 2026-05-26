package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ProcurementCatalogBean extends DefaultSession {
    private final ProcurementCatalogEJBDAO procurementCatalogEJBDAO = new ProcurementCatalogEJBDAO();
    public HashMap insertProcurementCatalog(DefaultParameters param) throws DefaultEJBException {
        return procurementCatalogEJBDAO.insertProcurementCatalog(param);
    }
    public Collection selectProcurementCatalogList(DefaultParameters param) throws DefaultEJBException {
        return procurementCatalogEJBDAO.selectProcurementCatalogList(param);
    }
    public HashMap selectProcurementCatalogDetail(DefaultParameters param) throws DefaultEJBException {
        return procurementCatalogEJBDAO.selectProcurementCatalogDetail(param);
    }
    public HashMap updateProcurementCatalog(DefaultParameters param) throws DefaultEJBException {
        return procurementCatalogEJBDAO.updateProcurementCatalog(param);
    }
    public HashMap deleteProcurementCatalog(DefaultParameters param) throws DefaultEJBException {
        return procurementCatalogEJBDAO.deleteProcurementCatalog(param);
    }
}