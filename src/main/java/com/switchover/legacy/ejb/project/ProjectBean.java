package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ProjectBean extends DefaultSession {
    private final ProjectEJBDAO projectEJBDAO = new ProjectEJBDAO();
    public HashMap insertProject(DefaultParameters param) throws DefaultEJBException {
        return projectEJBDAO.insertProject(param);
    }
    public Collection selectProjectList(DefaultParameters param) throws DefaultEJBException {
        return projectEJBDAO.selectProjectList(param);
    }
    public HashMap selectProjectDetail(DefaultParameters param) throws DefaultEJBException {
        return projectEJBDAO.selectProjectDetail(param);
    }
    public HashMap updateProject(DefaultParameters param) throws DefaultEJBException {
        return projectEJBDAO.updateProject(param);
    }
    public HashMap deleteProject(DefaultParameters param) throws DefaultEJBException {
        return projectEJBDAO.deleteProject(param);
    }
}