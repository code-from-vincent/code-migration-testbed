package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CallRecordBean extends DefaultSession {
    private final CallRecordEJBDAO callRecordEJBDAO = new CallRecordEJBDAO();
    public HashMap insertCallRecord(DefaultParameters param) throws DefaultEJBException {
        return callRecordEJBDAO.insertCallRecord(param);
    }
    public Collection selectCallRecordList(DefaultParameters param) throws DefaultEJBException {
        return callRecordEJBDAO.selectCallRecordList(param);
    }
    public HashMap selectCallRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return callRecordEJBDAO.selectCallRecordDetail(param);
    }
    public HashMap updateCallRecord(DefaultParameters param) throws DefaultEJBException {
        return callRecordEJBDAO.updateCallRecord(param);
    }
    public HashMap deleteCallRecord(DefaultParameters param) throws DefaultEJBException {
        return callRecordEJBDAO.deleteCallRecord(param);
    }
}