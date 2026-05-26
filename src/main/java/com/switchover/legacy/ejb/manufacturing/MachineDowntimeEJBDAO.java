package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class MachineDowntimeEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/manufacturing/054_machinedowntime/MachineDowntime_SQL.xml";
    public HashMap insertMachineDowntime(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MachineDowntimeEJBDAO.InsertMachineDowntime", param);
    }
    public Collection selectMachineDowntimeList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "MachineDowntimeEJBDAO.SelectMachineDowntimeList", param);
    }
    public HashMap selectMachineDowntimeDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MachineDowntimeEJBDAO.SelectMachineDowntimeDetail", param);
    }
    public HashMap updateMachineDowntime(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MachineDowntimeEJBDAO.UpdateMachineDowntime", param);
    }
    public HashMap deleteMachineDowntime(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MachineDowntimeEJBDAO.DeleteMachineDowntime", param);
    }
}