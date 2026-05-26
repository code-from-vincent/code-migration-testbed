package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class GeneralLedgerBean extends DefaultSession {
    private final GeneralLedgerEJBDAO generalLedgerEJBDAO = new GeneralLedgerEJBDAO();
    public HashMap insertGeneralLedger(DefaultParameters param) throws DefaultEJBException {
        return generalLedgerEJBDAO.insertGeneralLedger(param);
    }
    public Collection selectGeneralLedgerList(DefaultParameters param) throws DefaultEJBException {
        return generalLedgerEJBDAO.selectGeneralLedgerList(param);
    }
    public HashMap selectGeneralLedgerDetail(DefaultParameters param) throws DefaultEJBException {
        return generalLedgerEJBDAO.selectGeneralLedgerDetail(param);
    }
    public HashMap updateGeneralLedger(DefaultParameters param) throws DefaultEJBException {
        return generalLedgerEJBDAO.updateGeneralLedger(param);
    }
    public HashMap deleteGeneralLedger(DefaultParameters param) throws DefaultEJBException {
        return generalLedgerEJBDAO.deleteGeneralLedger(param);
    }
}