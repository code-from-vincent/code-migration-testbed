package com.switchover.legacy.ejb.esg;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class EnergyUsageEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/esg/193_energyusage/EnergyUsage_SQL.xml";
    public HashMap insertEnergyUsage(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EnergyUsageEJBDAO.InsertEnergyUsage", param);
    }
    public Collection selectEnergyUsageList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "EnergyUsageEJBDAO.SelectEnergyUsageList", param);
    }
    public HashMap selectEnergyUsageDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EnergyUsageEJBDAO.SelectEnergyUsageDetail", param);
    }
    public HashMap updateEnergyUsage(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EnergyUsageEJBDAO.UpdateEnergyUsage", param);
    }
    public HashMap deleteEnergyUsage(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EnergyUsageEJBDAO.DeleteEnergyUsage", param);
    }
}