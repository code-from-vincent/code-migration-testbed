package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ActionItemBean extends DefaultSession {
    private final ActionItemEJBDAO actionItemEJBDAO = new ActionItemEJBDAO();
    public HashMap insertActionItem(DefaultParameters param) throws DefaultEJBException {
        return actionItemEJBDAO.insertActionItem(param);
    }
    public Collection selectActionItemList(DefaultParameters param) throws DefaultEJBException {
        return actionItemEJBDAO.selectActionItemList(param);
    }
    public HashMap selectActionItemDetail(DefaultParameters param) throws DefaultEJBException {
        return actionItemEJBDAO.selectActionItemDetail(param);
    }
    public HashMap updateActionItem(DefaultParameters param) throws DefaultEJBException {
        return actionItemEJBDAO.updateActionItem(param);
    }
    public HashMap deleteActionItem(DefaultParameters param) throws DefaultEJBException {
        return actionItemEJBDAO.deleteActionItem(param);
    }
}