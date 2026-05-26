package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DeliveryAssignmentBean extends DefaultSession {
    private final DeliveryAssignmentEJBDAO deliveryAssignmentEJBDAO = new DeliveryAssignmentEJBDAO();
    public HashMap insertDeliveryAssignment(DefaultParameters param) throws DefaultEJBException {
        return deliveryAssignmentEJBDAO.insertDeliveryAssignment(param);
    }
    public Collection selectDeliveryAssignmentList(DefaultParameters param) throws DefaultEJBException {
        return deliveryAssignmentEJBDAO.selectDeliveryAssignmentList(param);
    }
    public HashMap selectDeliveryAssignmentDetail(DefaultParameters param) throws DefaultEJBException {
        return deliveryAssignmentEJBDAO.selectDeliveryAssignmentDetail(param);
    }
    public HashMap updateDeliveryAssignment(DefaultParameters param) throws DefaultEJBException {
        return deliveryAssignmentEJBDAO.updateDeliveryAssignment(param);
    }
    public HashMap deleteDeliveryAssignment(DefaultParameters param) throws DefaultEJBException {
        return deliveryAssignmentEJBDAO.deleteDeliveryAssignment(param);
    }
}