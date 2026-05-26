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

public class DeploymentHistoryAction extends DefaultAction {
    public ActionForward insertDeploymentHistory(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
    public ActionForward selectDeploymentHistoryList(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { HashMap hm=(HashMap)invokeLocal(req); Collection list=(Collection)hm.get("deploymenthistoryList"); req.setAttribute("deploymenthistoryList", list==null?new ArrayList():list); return null; }
    public ActionForward selectDeploymentHistoryDetail(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { HashMap hm=(HashMap)invokeLocal(req); req.setAttribute("deploymenthistoryDetail", hm.get("deploymenthistoryDetail")); return null; }
    public ActionForward updateDeploymentHistory(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
    public ActionForward deleteDeploymentHistory(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
}
