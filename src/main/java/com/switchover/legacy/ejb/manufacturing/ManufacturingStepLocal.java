package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ManufacturingStepLocal extends EJBLocalObject {
    HashMap insertManufacturingStep(DefaultParameters param) throws DefaultEJBException;
    Collection selectManufacturingStepList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectManufacturingStepDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateManufacturingStep(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteManufacturingStep(DefaultParameters param) throws DefaultEJBException;
}