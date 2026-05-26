package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ProductionPlanEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/manufacturing/049_productionplan/ProductionPlan_SQL.xml";
    public HashMap insertProductionPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductionPlanEJBDAO.InsertProductionPlan", param);
    }
    public Collection selectProductionPlanList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ProductionPlanEJBDAO.SelectProductionPlanList", param);
    }
    public HashMap selectProductionPlanDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductionPlanEJBDAO.SelectProductionPlanDetail", param);
    }
    public HashMap updateProductionPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductionPlanEJBDAO.UpdateProductionPlan", param);
    }
    public HashMap deleteProductionPlan(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProductionPlanEJBDAO.DeleteProductionPlan", param);
    }
}