package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CostCenterEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/114_costcenter/CostCenter_SQL.xml";
    public HashMap insertCostCenter(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CostCenterEJBDAO.InsertCostCenter", param);
    }
    public Collection selectCostCenterList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CostCenterEJBDAO.SelectCostCenterList", param);
    }
    public HashMap selectCostCenterDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CostCenterEJBDAO.SelectCostCenterDetail", param);
    }
    public HashMap updateCostCenter(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CostCenterEJBDAO.UpdateCostCenter", param);
    }
    public HashMap deleteCostCenter(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CostCenterEJBDAO.DeleteCostCenter", param);
    }
}