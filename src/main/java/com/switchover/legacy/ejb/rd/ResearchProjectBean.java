package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ResearchProjectBean extends DefaultSession {
    private final ResearchProjectEJBDAO researchProjectEJBDAO = new ResearchProjectEJBDAO();
    public HashMap insertResearchProject(DefaultParameters param) throws DefaultEJBException {
        return researchProjectEJBDAO.insertResearchProject(param);
    }
    public Collection selectResearchProjectList(DefaultParameters param) throws DefaultEJBException {
        return researchProjectEJBDAO.selectResearchProjectList(param);
    }
    public HashMap selectResearchProjectDetail(DefaultParameters param) throws DefaultEJBException {
        return researchProjectEJBDAO.selectResearchProjectDetail(param);
    }
    public HashMap updateResearchProject(DefaultParameters param) throws DefaultEJBException {
        return researchProjectEJBDAO.updateResearchProject(param);
    }
    public HashMap deleteResearchProject(DefaultParameters param) throws DefaultEJBException {
        return researchProjectEJBDAO.deleteResearchProject(param);
    }
}