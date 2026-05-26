package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class WorkOrderBean extends DefaultSession {
    private final WorkOrderEJBDAO workOrderEJBDAO = new WorkOrderEJBDAO();
    public HashMap insertWorkOrder(DefaultParameters param) throws DefaultEJBException {
        return workOrderEJBDAO.insertWorkOrder(param);
    }
    public Collection selectWorkOrderList(DefaultParameters param) throws DefaultEJBException {
        return workOrderEJBDAO.selectWorkOrderList(param);
    }
    public HashMap selectWorkOrderDetail(DefaultParameters param) throws DefaultEJBException {
        return workOrderEJBDAO.selectWorkOrderDetail(param);
    }
    public HashMap updateWorkOrder(DefaultParameters param) throws DefaultEJBException {
        return workOrderEJBDAO.updateWorkOrder(param);
    }
    public HashMap deleteWorkOrder(DefaultParameters param) throws DefaultEJBException {
        return workOrderEJBDAO.deleteWorkOrder(param);
    }
}