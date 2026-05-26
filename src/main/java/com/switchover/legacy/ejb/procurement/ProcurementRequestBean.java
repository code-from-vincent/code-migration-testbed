package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ProcurementRequestBean extends DefaultSession {
    private final ProcurementRequestEJBDAO procurementRequestEJBDAO = new ProcurementRequestEJBDAO();
    public HashMap insertProcurementRequest(DefaultParameters param) throws DefaultEJBException {
        return procurementRequestEJBDAO.insertProcurementRequest(param);
    }
    public Collection selectProcurementRequestList(DefaultParameters param) throws DefaultEJBException {
        return procurementRequestEJBDAO.selectProcurementRequestList(param);
    }
    public HashMap selectProcurementRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return procurementRequestEJBDAO.selectProcurementRequestDetail(param);
    }
    public HashMap updateProcurementRequest(DefaultParameters param) throws DefaultEJBException {
        return procurementRequestEJBDAO.updateProcurementRequest(param);
    }
    public HashMap deleteProcurementRequest(DefaultParameters param) throws DefaultEJBException {
        return procurementRequestEJBDAO.deleteProcurementRequest(param);
    }
}