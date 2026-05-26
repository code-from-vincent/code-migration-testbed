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

public class ArchiveRecordAction extends DefaultAction {
    public ActionForward insertArchiveRecord(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
    public ActionForward selectArchiveRecordList(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { HashMap hm=(HashMap)invokeLocal(req); Collection list=(Collection)hm.get("archiverecordList"); req.setAttribute("archiverecordList", list==null?new ArrayList():list); return null; }
    public ActionForward selectArchiveRecordDetail(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { HashMap hm=(HashMap)invokeLocal(req); req.setAttribute("archiverecordDetail", hm.get("archiverecordDetail")); return null; }
    public ActionForward updateArchiveRecord(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
    public ActionForward deleteArchiveRecord(ActionMapping m, ActionForm f, HttpServletRequest req, HttpServletResponse res) throws Exception { req.setAttribute("result", (HashMap)invokeLocal(req)); return null; }
}
