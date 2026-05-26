package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class GrantApplicationBean extends DefaultSession {
    private final GrantApplicationEJBDAO grantApplicationEJBDAO = new GrantApplicationEJBDAO();
    public HashMap insertGrantApplication(DefaultParameters param) throws DefaultEJBException {
        return grantApplicationEJBDAO.insertGrantApplication(param);
    }
    public Collection selectGrantApplicationList(DefaultParameters param) throws DefaultEJBException {
        return grantApplicationEJBDAO.selectGrantApplicationList(param);
    }
    public HashMap selectGrantApplicationDetail(DefaultParameters param) throws DefaultEJBException {
        return grantApplicationEJBDAO.selectGrantApplicationDetail(param);
    }
    public HashMap updateGrantApplication(DefaultParameters param) throws DefaultEJBException {
        return grantApplicationEJBDAO.updateGrantApplication(param);
    }
    public HashMap deleteGrantApplication(DefaultParameters param) throws DefaultEJBException {
        return grantApplicationEJBDAO.deleteGrantApplication(param);
    }
}