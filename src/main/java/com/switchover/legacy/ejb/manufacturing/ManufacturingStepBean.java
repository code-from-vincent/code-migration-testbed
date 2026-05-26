package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ManufacturingStepBean extends DefaultSession {
    private final ManufacturingStepEJBDAO manufacturingStepEJBDAO = new ManufacturingStepEJBDAO();
    public HashMap insertManufacturingStep(DefaultParameters param) throws DefaultEJBException {
        return manufacturingStepEJBDAO.insertManufacturingStep(param);
    }
    public Collection selectManufacturingStepList(DefaultParameters param) throws DefaultEJBException {
        return manufacturingStepEJBDAO.selectManufacturingStepList(param);
    }
    public HashMap selectManufacturingStepDetail(DefaultParameters param) throws DefaultEJBException {
        return manufacturingStepEJBDAO.selectManufacturingStepDetail(param);
    }
    public HashMap updateManufacturingStep(DefaultParameters param) throws DefaultEJBException {
        return manufacturingStepEJBDAO.updateManufacturingStep(param);
    }
    public HashMap deleteManufacturingStep(DefaultParameters param) throws DefaultEJBException {
        return manufacturingStepEJBDAO.deleteManufacturingStep(param);
    }
}