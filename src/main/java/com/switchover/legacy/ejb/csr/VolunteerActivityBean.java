package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class VolunteerActivityBean extends DefaultSession {
    private final VolunteerActivityEJBDAO volunteerActivityEJBDAO = new VolunteerActivityEJBDAO();
    public HashMap insertVolunteerActivity(DefaultParameters param) throws DefaultEJBException {
        return volunteerActivityEJBDAO.insertVolunteerActivity(param);
    }
    public Collection selectVolunteerActivityList(DefaultParameters param) throws DefaultEJBException {
        return volunteerActivityEJBDAO.selectVolunteerActivityList(param);
    }
    public HashMap selectVolunteerActivityDetail(DefaultParameters param) throws DefaultEJBException {
        return volunteerActivityEJBDAO.selectVolunteerActivityDetail(param);
    }
    public HashMap updateVolunteerActivity(DefaultParameters param) throws DefaultEJBException {
        return volunteerActivityEJBDAO.updateVolunteerActivity(param);
    }
    public HashMap deleteVolunteerActivity(DefaultParameters param) throws DefaultEJBException {
        return volunteerActivityEJBDAO.deleteVolunteerActivity(param);
    }
}