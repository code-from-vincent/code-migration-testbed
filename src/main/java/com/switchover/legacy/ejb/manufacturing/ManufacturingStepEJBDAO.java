package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ManufacturingStepEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/manufacturing/052_manufacturingstep/ManufacturingStep_SQL.xml";
    public HashMap insertManufacturingStep(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ManufacturingStepEJBDAO.InsertManufacturingStep", param);
    }
    public Collection selectManufacturingStepList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ManufacturingStepEJBDAO.SelectManufacturingStepList", param);
    }
    public HashMap selectManufacturingStepDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ManufacturingStepEJBDAO.SelectManufacturingStepDetail", param);
    }
    public HashMap updateManufacturingStep(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ManufacturingStepEJBDAO.UpdateManufacturingStep", param);
    }
    public HashMap deleteManufacturingStep(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ManufacturingStepEJBDAO.DeleteManufacturingStep", param);
    }
}