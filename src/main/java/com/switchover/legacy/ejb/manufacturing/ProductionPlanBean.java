package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ProductionPlanBean extends DefaultSession {
    private final ProductionPlanEJBDAO productionPlanEJBDAO = new ProductionPlanEJBDAO();
    public HashMap insertProductionPlan(DefaultParameters param) throws DefaultEJBException {
        return productionPlanEJBDAO.insertProductionPlan(param);
    }
    public Collection selectProductionPlanList(DefaultParameters param) throws DefaultEJBException {
        return productionPlanEJBDAO.selectProductionPlanList(param);
    }
    public HashMap selectProductionPlanDetail(DefaultParameters param) throws DefaultEJBException {
        return productionPlanEJBDAO.selectProductionPlanDetail(param);
    }
    public HashMap updateProductionPlan(DefaultParameters param) throws DefaultEJBException {
        return productionPlanEJBDAO.updateProductionPlan(param);
    }
    public HashMap deleteProductionPlan(DefaultParameters param) throws DefaultEJBException {
        return productionPlanEJBDAO.deleteProductionPlan(param);
    }
}