package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ProjectTaskLocal extends EJBLocalObject {
    HashMap insertProjectTask(DefaultParameters param) throws DefaultEJBException;
    Collection selectProjectTaskList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectProjectTaskDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateProjectTask(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteProjectTask(DefaultParameters param) throws DefaultEJBException;
}