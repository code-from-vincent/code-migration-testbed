package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CodeDetailBean extends DefaultSession {
    private final CodeDetailEJBDAO codeDetailEJBDAO = new CodeDetailEJBDAO();
    public HashMap insertCodeDetail(DefaultParameters param) throws DefaultEJBException {
        return codeDetailEJBDAO.insertCodeDetail(param);
    }
    public Collection selectCodeDetailList(DefaultParameters param) throws DefaultEJBException {
        return codeDetailEJBDAO.selectCodeDetailList(param);
    }
    public HashMap selectCodeDetailDetail(DefaultParameters param) throws DefaultEJBException {
        return codeDetailEJBDAO.selectCodeDetailDetail(param);
    }
    public HashMap updateCodeDetail(DefaultParameters param) throws DefaultEJBException {
        return codeDetailEJBDAO.updateCodeDetail(param);
    }
    public HashMap deleteCodeDetail(DefaultParameters param) throws DefaultEJBException {
        return codeDetailEJBDAO.deleteCodeDetail(param);
    }
}