package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface TrainingCourse extends EJBObject {
    HashMap insertTrainingCourse(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTrainingCourseList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTrainingCourseDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTrainingCourse(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTrainingCourse(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
