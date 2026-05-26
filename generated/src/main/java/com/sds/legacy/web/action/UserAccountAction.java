package com.sds.legacy.web.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import gov.mogaha.ntis.cmm.web.DefaultAction;

public class UserAccountAction extends DefaultAction {
    public ActionForward insertUserAccount(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
    public ActionForward selectUserAccountList(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { HashMap hm=(HashMap)invokeLocal(req); Collection list=(Collection)hm.get("useraccountList"); req.setAttribute("useraccountList", list==null?new ArrayList():list); return null; }
    public ActionForward selectUserAccountDetail(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { HashMap hm=(HashMap)invokeLocal(req); req.setAttribute("useraccountDetail", hm.get("useraccountDetail")); return null; }
    public ActionForward updateUserAccount(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
    public ActionForward deleteUserAccount(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
}
