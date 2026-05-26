package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class BranchOfficeBean extends DefaultSession {
    private final BranchOfficeEJBDAO branchOfficeEJBDAO = new BranchOfficeEJBDAO();
    public HashMap insertBranchOffice(DefaultParameters param) throws DefaultEJBException {
        return branchOfficeEJBDAO.insertBranchOffice(param);
    }
    public Collection selectBranchOfficeList(DefaultParameters param) throws DefaultEJBException {
        return branchOfficeEJBDAO.selectBranchOfficeList(param);
    }
    public HashMap selectBranchOfficeDetail(DefaultParameters param) throws DefaultEJBException {
        return branchOfficeEJBDAO.selectBranchOfficeDetail(param);
    }
    public HashMap updateBranchOffice(DefaultParameters param) throws DefaultEJBException {
        return branchOfficeEJBDAO.updateBranchOffice(param);
    }
    public HashMap deleteBranchOffice(DefaultParameters param) throws DefaultEJBException {
        return branchOfficeEJBDAO.deleteBranchOffice(param);
    }
}