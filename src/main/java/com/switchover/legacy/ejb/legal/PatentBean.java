package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PatentBean extends DefaultSession {
    private final PatentEJBDAO patentEJBDAO = new PatentEJBDAO();
    public HashMap insertPatent(DefaultParameters param) throws DefaultEJBException {
        return patentEJBDAO.insertPatent(param);
    }
    public Collection selectPatentList(DefaultParameters param) throws DefaultEJBException {
        return patentEJBDAO.selectPatentList(param);
    }
    public HashMap selectPatentDetail(DefaultParameters param) throws DefaultEJBException {
        return patentEJBDAO.selectPatentDetail(param);
    }
    public HashMap updatePatent(DefaultParameters param) throws DefaultEJBException {
        return patentEJBDAO.updatePatent(param);
    }
    public HashMap deletePatent(DefaultParameters param) throws DefaultEJBException {
        return patentEJBDAO.deletePatent(param);
    }
}