package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class FuelTransactionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/logistics/102_fueltransaction/FuelTransaction_SQL.xml";
    public HashMap insertFuelTransaction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FuelTransactionEJBDAO.InsertFuelTransaction", param);
    }
    public Collection selectFuelTransactionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "FuelTransactionEJBDAO.SelectFuelTransactionList", param);
    }
    public HashMap selectFuelTransactionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FuelTransactionEJBDAO.SelectFuelTransactionDetail", param);
    }
    public HashMap updateFuelTransaction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FuelTransactionEJBDAO.UpdateFuelTransaction", param);
    }
    public HashMap deleteFuelTransaction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FuelTransactionEJBDAO.DeleteFuelTransaction", param);
    }
}