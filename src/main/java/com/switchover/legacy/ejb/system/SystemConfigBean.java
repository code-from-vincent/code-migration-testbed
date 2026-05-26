package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SystemConfigBean extends DefaultSession {
    private final SystemConfigEJBDAO systemConfigEJBDAO = new SystemConfigEJBDAO();
    public HashMap insertSystemConfig(DefaultParameters param) throws DefaultEJBException {
        return systemConfigEJBDAO.insertSystemConfig(param);
    }
    public Collection selectSystemConfigList(DefaultParameters param) throws DefaultEJBException {
        return systemConfigEJBDAO.selectSystemConfigList(param);
    }
    public HashMap selectSystemConfigDetail(DefaultParameters param) throws DefaultEJBException {
        return systemConfigEJBDAO.selectSystemConfigDetail(param);
    }
    public HashMap updateSystemConfig(DefaultParameters param) throws DefaultEJBException {
        return systemConfigEJBDAO.updateSystemConfig(param);
    }
    public HashMap deleteSystemConfig(DefaultParameters param) throws DefaultEJBException {
        return systemConfigEJBDAO.deleteSystemConfig(param);
    }
}