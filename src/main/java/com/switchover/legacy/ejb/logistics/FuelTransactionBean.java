package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class FuelTransactionBean extends DefaultSession {
    private final FuelTransactionEJBDAO fuelTransactionEJBDAO = new FuelTransactionEJBDAO();
    public HashMap insertFuelTransaction(DefaultParameters param) throws DefaultEJBException {
        return fuelTransactionEJBDAO.insertFuelTransaction(param);
    }
    public Collection selectFuelTransactionList(DefaultParameters param) throws DefaultEJBException {
        return fuelTransactionEJBDAO.selectFuelTransactionList(param);
    }
    public HashMap selectFuelTransactionDetail(DefaultParameters param) throws DefaultEJBException {
        return fuelTransactionEJBDAO.selectFuelTransactionDetail(param);
    }
    public HashMap updateFuelTransaction(DefaultParameters param) throws DefaultEJBException {
        return fuelTransactionEJBDAO.updateFuelTransaction(param);
    }
    public HashMap deleteFuelTransaction(DefaultParameters param) throws DefaultEJBException {
        return fuelTransactionEJBDAO.deleteFuelTransaction(param);
    }
}