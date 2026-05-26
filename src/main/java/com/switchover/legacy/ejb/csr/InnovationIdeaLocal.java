package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface InnovationIdeaLocal extends EJBLocalObject {
    HashMap insertInnovationIdea(DefaultParameters param) throws DefaultEJBException;
    Collection selectInnovationIdeaList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectInnovationIdeaDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateInnovationIdea(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteInnovationIdea(DefaultParameters param) throws DefaultEJBException;
}