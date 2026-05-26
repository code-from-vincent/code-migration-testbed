package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class BudgetPlanEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/021_budgetplan/BudgetPlan_SQL.xml";
    public HashMap insertBudgetPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BudgetPlanEJBDAO.InsertBudgetPlan", param);
    }
    public Collection selectBudgetPlanList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "BudgetPlanEJBDAO.SelectBudgetPlanList", param);
    }
    public HashMap selectBudgetPlanDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BudgetPlanEJBDAO.SelectBudgetPlanDetail", param);
    }
    public HashMap updateBudgetPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BudgetPlanEJBDAO.UpdateBudgetPlan", param);
    }
    public HashMap deleteBudgetPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BudgetPlanEJBDAO.DeleteBudgetPlan", param);
    }
}