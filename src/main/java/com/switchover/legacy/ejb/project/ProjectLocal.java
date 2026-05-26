package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ProjectLocal extends EJBLocalObject {
    HashMap insertProject(DefaultParameters param) throws DefaultEJBException;
    Collection selectProjectList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectProjectDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateProject(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteProject(DefaultParameters param) throws DefaultEJBException;
}