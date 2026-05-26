package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ContractChangeBean extends DefaultSession {
    private final ContractChangeEJBDAO contractChangeEJBDAO = new ContractChangeEJBDAO();
    public HashMap insertContractChange(DefaultParameters param) throws DefaultEJBException {
        return contractChangeEJBDAO.insertContractChange(param);
    }
    public Collection selectContractChangeList(DefaultParameters param) throws DefaultEJBException {
        return contractChangeEJBDAO.selectContractChangeList(param);
    }
    public HashMap selectContractChangeDetail(DefaultParameters param) throws DefaultEJBException {
        return contractChangeEJBDAO.selectContractChangeDetail(param);
    }
    public HashMap updateContractChange(DefaultParameters param) throws DefaultEJBException {
        return contractChangeEJBDAO.updateContractChange(param);
    }
    public HashMap deleteContractChange(DefaultParameters param) throws DefaultEJBException {
        return contractChangeEJBDAO.deleteContractChange(param);
    }
}