package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ApiAccessLogBean extends DefaultSession {
    private final ApiAccessLogEJBDAO apiAccessLogEJBDAO = new ApiAccessLogEJBDAO();
    public HashMap insertApiAccessLog(DefaultParameters param) throws DefaultEJBException {
        return apiAccessLogEJBDAO.insertApiAccessLog(param);
    }
    public Collection selectApiAccessLogList(DefaultParameters param) throws DefaultEJBException {
        return apiAccessLogEJBDAO.selectApiAccessLogList(param);
    }
    public HashMap selectApiAccessLogDetail(DefaultParameters param) throws DefaultEJBException {
        return apiAccessLogEJBDAO.selectApiAccessLogDetail(param);
    }
    public HashMap updateApiAccessLog(DefaultParameters param) throws DefaultEJBException {
        return apiAccessLogEJBDAO.updateApiAccessLog(param);
    }
    public HashMap deleteApiAccessLog(DefaultParameters param) throws DefaultEJBException {
        return apiAccessLogEJBDAO.deleteApiAccessLog(param);
    }
}