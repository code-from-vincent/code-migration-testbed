package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CostCenterLocal extends EJBLocalObject {
    HashMap insertCostCenter(DefaultParameters param) throws DefaultEJBException;
    Collection selectCostCenterList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCostCenterDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCostCenter(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCostCenter(DefaultParameters param) throws DefaultEJBException;
}