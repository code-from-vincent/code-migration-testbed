package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ApiClientBean extends DefaultSession {
    private final ApiClientEJBDAO apiClientEJBDAO = new ApiClientEJBDAO();
    public HashMap insertApiClient(DefaultParameters param) throws DefaultEJBException {
        return apiClientEJBDAO.insertApiClient(param);
    }
    public Collection selectApiClientList(DefaultParameters param) throws DefaultEJBException {
        return apiClientEJBDAO.selectApiClientList(param);
    }
    public HashMap selectApiClientDetail(DefaultParameters param) throws DefaultEJBException {
        return apiClientEJBDAO.selectApiClientDetail(param);
    }
    public HashMap updateApiClient(DefaultParameters param) throws DefaultEJBException {
        return apiClientEJBDAO.updateApiClient(param);
    }
    public HashMap deleteApiClient(DefaultParameters param) throws DefaultEJBException {
        return apiClientEJBDAO.deleteApiClient(param);
    }
}