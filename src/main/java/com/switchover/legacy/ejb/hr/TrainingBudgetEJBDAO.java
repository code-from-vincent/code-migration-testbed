package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class TrainingBudgetEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/191_trainingbudget/TrainingBudget_SQL.xml";
    public HashMap insertTrainingBudget(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingBudgetEJBDAO.InsertTrainingBudget", param);
    }
    public Collection selectTrainingBudgetList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "TrainingBudgetEJBDAO.SelectTrainingBudgetList", param);
    }
    public HashMap selectTrainingBudgetDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingBudgetEJBDAO.SelectTrainingBudgetDetail", param);
    }
    public HashMap updateTrainingBudget(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingBudgetEJBDAO.UpdateTrainingBudget", param);
    }
    public HashMap deleteTrainingBudget(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingBudgetEJBDAO.DeleteTrainingBudget", param);
    }
}