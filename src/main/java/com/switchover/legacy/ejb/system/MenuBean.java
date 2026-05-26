package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class MenuBean extends DefaultSession {
    private final MenuEJBDAO menuEJBDAO = new MenuEJBDAO();
    public HashMap insertMenu(DefaultParameters param) throws DefaultEJBException {
        return menuEJBDAO.insertMenu(param);
    }
    public Collection selectMenuList(DefaultParameters param) throws DefaultEJBException {
        return menuEJBDAO.selectMenuList(param);
    }
    public HashMap selectMenuDetail(DefaultParameters param) throws DefaultEJBException {
        return menuEJBDAO.selectMenuDetail(param);
    }
    public HashMap updateMenu(DefaultParameters param) throws DefaultEJBException {
        return menuEJBDAO.updateMenu(param);
    }
    public HashMap deleteMenu(DefaultParameters param) throws DefaultEJBException {
        return menuEJBDAO.deleteMenu(param);
    }
}