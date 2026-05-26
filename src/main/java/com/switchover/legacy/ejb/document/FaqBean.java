package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class FaqBean extends DefaultSession {
    private final FaqEJBDAO faqEJBDAO = new FaqEJBDAO();
    public HashMap insertFaq(DefaultParameters param) throws DefaultEJBException {
        return faqEJBDAO.insertFaq(param);
    }
    public Collection selectFaqList(DefaultParameters param) throws DefaultEJBException {
        return faqEJBDAO.selectFaqList(param);
    }
    public HashMap selectFaqDetail(DefaultParameters param) throws DefaultEJBException {
        return faqEJBDAO.selectFaqDetail(param);
    }
    public HashMap updateFaq(DefaultParameters param) throws DefaultEJBException {
        return faqEJBDAO.updateFaq(param);
    }
    public HashMap deleteFaq(DefaultParameters param) throws DefaultEJBException {
        return faqEJBDAO.deleteFaq(param);
    }
}