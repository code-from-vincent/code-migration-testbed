package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ThirdPartyRiskBean extends DefaultSession {
    private final ThirdPartyRiskEJBDAO thirdPartyRiskEJBDAO = new ThirdPartyRiskEJBDAO();
    public HashMap insertThirdPartyRisk(DefaultParameters param) throws DefaultEJBException {
        return thirdPartyRiskEJBDAO.insertThirdPartyRisk(param);
    }
    public Collection selectThirdPartyRiskList(DefaultParameters param) throws DefaultEJBException {
        return thirdPartyRiskEJBDAO.selectThirdPartyRiskList(param);
    }
    public HashMap selectThirdPartyRiskDetail(DefaultParameters param) throws DefaultEJBException {
        return thirdPartyRiskEJBDAO.selectThirdPartyRiskDetail(param);
    }
    public HashMap updateThirdPartyRisk(DefaultParameters param) throws DefaultEJBException {
        return thirdPartyRiskEJBDAO.updateThirdPartyRisk(param);
    }
    public HashMap deleteThirdPartyRisk(DefaultParameters param) throws DefaultEJBException {
        return thirdPartyRiskEJBDAO.deleteThirdPartyRisk(param);
    }
}