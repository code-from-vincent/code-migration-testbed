package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class MachineEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/manufacturing/053_machine/Machine_SQL.xml";
    public HashMap insertMachine(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MachineEJBDAO.InsertMachine", param);
    }
    public Collection selectMachineList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "MachineEJBDAO.SelectMachineList", param);
    }
    public HashMap selectMachineDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MachineEJBDAO.SelectMachineDetail", param);
    }
    public HashMap updateMachine(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MachineEJBDAO.UpdateMachine", param);
    }
    public HashMap deleteMachine(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MachineEJBDAO.DeleteMachine", param);
    }
}