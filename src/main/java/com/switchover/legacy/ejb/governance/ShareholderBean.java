package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ShareholderBean extends DefaultSession {
    private final ShareholderEJBDAO shareholderEJBDAO = new ShareholderEJBDAO();
    public HashMap insertShareholder(DefaultParameters param) throws DefaultEJBException {
        return shareholderEJBDAO.insertShareholder(param);
    }
    public Collection selectShareholderList(DefaultParameters param) throws DefaultEJBException {
        return shareholderEJBDAO.selectShareholderList(param);
    }
    public HashMap selectShareholderDetail(DefaultParameters param) throws DefaultEJBException {
        return shareholderEJBDAO.selectShareholderDetail(param);
    }
    public HashMap updateShareholder(DefaultParameters param) throws DefaultEJBException {
        return shareholderEJBDAO.updateShareholder(param);
    }
    public HashMap deleteShareholder(DefaultParameters param) throws DefaultEJBException {
        return shareholderEJBDAO.deleteShareholder(param);
    }
}