package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DeploymentHistoryBean extends DefaultSession {
    private final DeploymentHistoryEJBDAO deploymentHistoryEJBDAO = new DeploymentHistoryEJBDAO();
    public HashMap insertDeploymentHistory(DefaultParameters param) throws DefaultEJBException {
        return deploymentHistoryEJBDAO.insertDeploymentHistory(param);
    }
    public Collection selectDeploymentHistoryList(DefaultParameters param) throws DefaultEJBException {
        return deploymentHistoryEJBDAO.selectDeploymentHistoryList(param);
    }
    public HashMap selectDeploymentHistoryDetail(DefaultParameters param) throws DefaultEJBException {
        return deploymentHistoryEJBDAO.selectDeploymentHistoryDetail(param);
    }
    public HashMap updateDeploymentHistory(DefaultParameters param) throws DefaultEJBException {
        return deploymentHistoryEJBDAO.updateDeploymentHistory(param);
    }
    public HashMap deleteDeploymentHistory(DefaultParameters param) throws DefaultEJBException {
        return deploymentHistoryEJBDAO.deleteDeploymentHistory(param);
    }
}