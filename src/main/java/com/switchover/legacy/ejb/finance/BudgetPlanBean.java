package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class BudgetPlanBean extends DefaultSession {
    private final BudgetPlanEJBDAO budgetPlanEJBDAO = new BudgetPlanEJBDAO();
    public HashMap insertBudgetPlan(DefaultParameters param) throws DefaultEJBException {
        return budgetPlanEJBDAO.insertBudgetPlan(param);
    }
    public Collection selectBudgetPlanList(DefaultParameters param) throws DefaultEJBException {
        return budgetPlanEJBDAO.selectBudgetPlanList(param);
    }
    public HashMap selectBudgetPlanDetail(DefaultParameters param) throws DefaultEJBException {
        return budgetPlanEJBDAO.selectBudgetPlanDetail(param);
    }
    public HashMap updateBudgetPlan(DefaultParameters param) throws DefaultEJBException {
        return budgetPlanEJBDAO.updateBudgetPlan(param);
    }
    public HashMap deleteBudgetPlan(DefaultParameters param) throws DefaultEJBException {
        return budgetPlanEJBDAO.deleteBudgetPlan(param);
    }
}