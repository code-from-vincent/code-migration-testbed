package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface MentoringProgramLocal extends EJBLocalObject {
    HashMap insertMentoringProgram(DefaultParameters param) throws DefaultEJBException;
    Collection selectMentoringProgramList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectMentoringProgramDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateMentoringProgram(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteMentoringProgram(DefaultParameters param) throws DefaultEJBException;
}