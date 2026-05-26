package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class MentoringProgramBean extends DefaultSession {
    private final MentoringProgramEJBDAO mentoringProgramEJBDAO = new MentoringProgramEJBDAO();
    public HashMap insertMentoringProgram(DefaultParameters param) throws DefaultEJBException {
        return mentoringProgramEJBDAO.insertMentoringProgram(param);
    }
    public Collection selectMentoringProgramList(DefaultParameters param) throws DefaultEJBException {
        return mentoringProgramEJBDAO.selectMentoringProgramList(param);
    }
    public HashMap selectMentoringProgramDetail(DefaultParameters param) throws DefaultEJBException {
        return mentoringProgramEJBDAO.selectMentoringProgramDetail(param);
    }
    public HashMap updateMentoringProgram(DefaultParameters param) throws DefaultEJBException {
        return mentoringProgramEJBDAO.updateMentoringProgram(param);
    }
    public HashMap deleteMentoringProgram(DefaultParameters param) throws DefaultEJBException {
        return mentoringProgramEJBDAO.deleteMentoringProgram(param);
    }
}