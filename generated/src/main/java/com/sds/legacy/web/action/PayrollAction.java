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

public class PayrollAction extends DefaultAction {
    public ActionForward insertPayroll(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
    public ActionForward selectPayrollList(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { HashMap hm=(HashMap)invokeLocal(req); Collection list=(Collection)hm.get("payrollList"); req.setAttribute("payrollList", list==null?new ArrayList():list); return null; }
    public ActionForward selectPayrollDetail(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { HashMap hm=(HashMap)invokeLocal(req); req.setAttribute("payrollDetail", hm.get("payrollDetail")); return null; }
    public ActionForward updatePayroll(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
    public ActionForward deletePayroll(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
}
