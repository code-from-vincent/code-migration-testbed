package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DataMaskingRuleBean extends DefaultSession {
    private final DataMaskingRuleEJBDAO dataMaskingRuleEJBDAO = new DataMaskingRuleEJBDAO();
    public HashMap insertDataMaskingRule(DefaultParameters param) throws DefaultEJBException {
        return dataMaskingRuleEJBDAO.insertDataMaskingRule(param);
    }
    public Collection selectDataMaskingRuleList(DefaultParameters param) throws DefaultEJBException {
        return dataMaskingRuleEJBDAO.selectDataMaskingRuleList(param);
    }
    public HashMap selectDataMaskingRuleDetail(DefaultParameters param) throws DefaultEJBException {
        return dataMaskingRuleEJBDAO.selectDataMaskingRuleDetail(param);
    }
    public HashMap updateDataMaskingRule(DefaultParameters param) throws DefaultEJBException {
        return dataMaskingRuleEJBDAO.updateDataMaskingRule(param);
    }
    public HashMap deleteDataMaskingRule(DefaultParameters param) throws DefaultEJBException {
        return dataMaskingRuleEJBDAO.deleteDataMaskingRule(param);
    }
}