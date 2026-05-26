package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DeploymentHistoryEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/project/149_deploymenthistory/DeploymentHistory_SQL.xml";
    public HashMap insertDeploymentHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DeploymentHistoryEJBDAO.InsertDeploymentHistory", param);
    }
    public Collection selectDeploymentHistoryList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DeploymentHistoryEJBDAO.SelectDeploymentHistoryList", param);
    }
    public HashMap selectDeploymentHistoryDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DeploymentHistoryEJBDAO.SelectDeploymentHistoryDetail", param);
    }
    public HashMap updateDeploymentHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DeploymentHistoryEJBDAO.UpdateDeploymentHistory", param);
    }
    public HashMap deleteDeploymentHistory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DeploymentHistoryEJBDAO.DeleteDeploymentHistory", param);
    }
}