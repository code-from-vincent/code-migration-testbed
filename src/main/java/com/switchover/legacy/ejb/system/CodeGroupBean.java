package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CodeGroupBean extends DefaultSession {
    private final CodeGroupEJBDAO codeGroupEJBDAO = new CodeGroupEJBDAO();
    public HashMap insertCodeGroup(DefaultParameters param) throws DefaultEJBException {
        return codeGroupEJBDAO.insertCodeGroup(param);
    }
    public Collection selectCodeGroupList(DefaultParameters param) throws DefaultEJBException {
        return codeGroupEJBDAO.selectCodeGroupList(param);
    }
    public HashMap selectCodeGroupDetail(DefaultParameters param) throws DefaultEJBException {
        return codeGroupEJBDAO.selectCodeGroupDetail(param);
    }
    public HashMap updateCodeGroup(DefaultParameters param) throws DefaultEJBException {
        return codeGroupEJBDAO.updateCodeGroup(param);
    }
    public HashMap deleteCodeGroup(DefaultParameters param) throws DefaultEJBException {
        return codeGroupEJBDAO.deleteCodeGroup(param);
    }
}