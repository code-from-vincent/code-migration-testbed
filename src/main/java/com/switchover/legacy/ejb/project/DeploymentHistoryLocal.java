package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DeploymentHistoryLocal extends EJBLocalObject {
    HashMap insertDeploymentHistory(DefaultParameters param) throws DefaultEJBException;
    Collection selectDeploymentHistoryList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDeploymentHistoryDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDeploymentHistory(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDeploymentHistory(DefaultParameters param) throws DefaultEJBException;
}