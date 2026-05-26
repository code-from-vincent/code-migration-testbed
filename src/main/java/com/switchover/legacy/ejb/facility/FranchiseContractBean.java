package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class FranchiseContractBean extends DefaultSession {
    private final FranchiseContractEJBDAO franchiseContractEJBDAO = new FranchiseContractEJBDAO();
    public HashMap insertFranchiseContract(DefaultParameters param) throws DefaultEJBException {
        return franchiseContractEJBDAO.insertFranchiseContract(param);
    }
    public Collection selectFranchiseContractList(DefaultParameters param) throws DefaultEJBException {
        return franchiseContractEJBDAO.selectFranchiseContractList(param);
    }
    public HashMap selectFranchiseContractDetail(DefaultParameters param) throws DefaultEJBException {
        return franchiseContractEJBDAO.selectFranchiseContractDetail(param);
    }
    public HashMap updateFranchiseContract(DefaultParameters param) throws DefaultEJBException {
        return franchiseContractEJBDAO.updateFranchiseContract(param);
    }
    public HashMap deleteFranchiseContract(DefaultParameters param) throws DefaultEJBException {
        return franchiseContractEJBDAO.deleteFranchiseContract(param);
    }
}