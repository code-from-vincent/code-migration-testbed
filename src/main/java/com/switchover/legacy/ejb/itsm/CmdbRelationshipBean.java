package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CmdbRelationshipBean extends DefaultSession {
    private final CmdbRelationshipEJBDAO cmdbRelationshipEJBDAO = new CmdbRelationshipEJBDAO();
    public HashMap insertCmdbRelationship(DefaultParameters param) throws DefaultEJBException {
        return cmdbRelationshipEJBDAO.insertCmdbRelationship(param);
    }
    public Collection selectCmdbRelationshipList(DefaultParameters param) throws DefaultEJBException {
        return cmdbRelationshipEJBDAO.selectCmdbRelationshipList(param);
    }
    public HashMap selectCmdbRelationshipDetail(DefaultParameters param) throws DefaultEJBException {
        return cmdbRelationshipEJBDAO.selectCmdbRelationshipDetail(param);
    }
    public HashMap updateCmdbRelationship(DefaultParameters param) throws DefaultEJBException {
        return cmdbRelationshipEJBDAO.updateCmdbRelationship(param);
    }
    public HashMap deleteCmdbRelationship(DefaultParameters param) throws DefaultEJBException {
        return cmdbRelationshipEJBDAO.deleteCmdbRelationship(param);
    }
}