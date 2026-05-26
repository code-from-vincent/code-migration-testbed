package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ConfigurationItemBean extends DefaultSession {
    private final ConfigurationItemEJBDAO configurationItemEJBDAO = new ConfigurationItemEJBDAO();
    public HashMap insertConfigurationItem(DefaultParameters param) throws DefaultEJBException {
        return configurationItemEJBDAO.insertConfigurationItem(param);
    }
    public Collection selectConfigurationItemList(DefaultParameters param) throws DefaultEJBException {
        return configurationItemEJBDAO.selectConfigurationItemList(param);
    }
    public HashMap selectConfigurationItemDetail(DefaultParameters param) throws DefaultEJBException {
        return configurationItemEJBDAO.selectConfigurationItemDetail(param);
    }
    public HashMap updateConfigurationItem(DefaultParameters param) throws DefaultEJBException {
        return configurationItemEJBDAO.updateConfigurationItem(param);
    }
    public HashMap deleteConfigurationItem(DefaultParameters param) throws DefaultEJBException {
        return configurationItemEJBDAO.deleteConfigurationItem(param);
    }
}