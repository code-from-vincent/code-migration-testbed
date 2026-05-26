package kr.some.cmm.web;

import org.apache.struts.action.Action;
import javax.servlet.http.HttpServletRequest;

/**
 * NTIS framework base Struts Action.
 * Each domain *Action extends this class and calls invokeLocal()
 * to delegate to the corresponding EJB via JNDI lookup in a live WAS.
 */
public abstract class DefaultAction extends Action {

    /**
     * Looks up and invokes the EJB locally, returning a HashMap or Collection result.
     * Requires a live WAS container with an active JNDI context.
     */
    protected Object invokeLocal(HttpServletRequest request) throws Exception {
        throw new UnsupportedOperationException(
            "invokeLocal() requires a live WAS container with JNDI context.");
    }
}

