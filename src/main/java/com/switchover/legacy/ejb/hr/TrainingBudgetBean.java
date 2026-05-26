package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class TrainingBudgetBean extends DefaultSession {
    private final TrainingBudgetEJBDAO trainingBudgetEJBDAO = new TrainingBudgetEJBDAO();
    public HashMap insertTrainingBudget(DefaultParameters param) throws DefaultEJBException {
        return trainingBudgetEJBDAO.insertTrainingBudget(param);
    }
    public Collection selectTrainingBudgetList(DefaultParameters param) throws DefaultEJBException {
        return trainingBudgetEJBDAO.selectTrainingBudgetList(param);
    }
    public HashMap selectTrainingBudgetDetail(DefaultParameters param) throws DefaultEJBException {
        return trainingBudgetEJBDAO.selectTrainingBudgetDetail(param);
    }
    public HashMap updateTrainingBudget(DefaultParameters param) throws DefaultEJBException {
        return trainingBudgetEJBDAO.updateTrainingBudget(param);
    }
    public HashMap deleteTrainingBudget(DefaultParameters param) throws DefaultEJBException {
        return trainingBudgetEJBDAO.deleteTrainingBudget(param);
    }
}