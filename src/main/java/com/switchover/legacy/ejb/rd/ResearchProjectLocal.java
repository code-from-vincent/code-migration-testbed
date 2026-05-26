package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ResearchProjectLocal extends EJBLocalObject {
    HashMap insertResearchProject(DefaultParameters param) throws DefaultEJBException;
    Collection selectResearchProjectList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectResearchProjectDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateResearchProject(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteResearchProject(DefaultParameters param) throws DefaultEJBException;
}