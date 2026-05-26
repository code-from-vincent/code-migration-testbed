package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class InnovationIdeaBean extends DefaultSession {
    private final InnovationIdeaEJBDAO innovationIdeaEJBDAO = new InnovationIdeaEJBDAO();
    public HashMap insertInnovationIdea(DefaultParameters param) throws DefaultEJBException {
        return innovationIdeaEJBDAO.insertInnovationIdea(param);
    }
    public Collection selectInnovationIdeaList(DefaultParameters param) throws DefaultEJBException {
        return innovationIdeaEJBDAO.selectInnovationIdeaList(param);
    }
    public HashMap selectInnovationIdeaDetail(DefaultParameters param) throws DefaultEJBException {
        return innovationIdeaEJBDAO.selectInnovationIdeaDetail(param);
    }
    public HashMap updateInnovationIdea(DefaultParameters param) throws DefaultEJBException {
        return innovationIdeaEJBDAO.updateInnovationIdea(param);
    }
    public HashMap deleteInnovationIdea(DefaultParameters param) throws DefaultEJBException {
        return innovationIdeaEJBDAO.deleteInnovationIdea(param);
    }
}