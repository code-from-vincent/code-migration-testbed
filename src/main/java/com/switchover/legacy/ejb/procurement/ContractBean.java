package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ContractBean extends DefaultSession {
    private final ContractEJBDAO contractEJBDAO = new ContractEJBDAO();
    public HashMap insertContract(DefaultParameters param) throws DefaultEJBException {
        return contractEJBDAO.insertContract(param);
    }
    public Collection selectContractList(DefaultParameters param) throws DefaultEJBException {
        return contractEJBDAO.selectContractList(param);
    }
    public HashMap selectContractDetail(DefaultParameters param) throws DefaultEJBException {
        return contractEJBDAO.selectContractDetail(param);
    }
    public HashMap updateContract(DefaultParameters param) throws DefaultEJBException {
        return contractEJBDAO.updateContract(param);
    }
    public HashMap deleteContract(DefaultParameters param) throws DefaultEJBException {
        return contractEJBDAO.deleteContract(param);
    }
}