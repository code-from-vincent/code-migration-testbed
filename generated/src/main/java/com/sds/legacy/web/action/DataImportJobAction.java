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

public class DataImportJobAction extends DefaultAction {
    public ActionForward insertDataImportJob(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
    public ActionForward selectDataImportJobList(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { HashMap hm=(HashMap)invokeLocal(req); Collection list=(Collection)hm.get("dataimportjobList"); req.setAttribute("dataimportjobList", list==null?new ArrayList():list); return null; }
    public ActionForward selectDataImportJobDetail(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { HashMap hm=(HashMap)invokeLocal(req); req.setAttribute("dataimportjobDetail", hm.get("dataimportjobDetail")); return null; }
    public ActionForward updateDataImportJob(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
    public ActionForward deleteDataImportJob(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
}
