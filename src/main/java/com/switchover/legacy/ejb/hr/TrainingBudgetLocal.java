package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface TrainingBudgetLocal extends EJBLocalObject {
    HashMap insertTrainingBudget(DefaultParameters param) throws DefaultEJBException;
    Collection selectTrainingBudgetList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectTrainingBudgetDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateTrainingBudget(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteTrainingBudget(DefaultParameters param) throws DefaultEJBException;
}