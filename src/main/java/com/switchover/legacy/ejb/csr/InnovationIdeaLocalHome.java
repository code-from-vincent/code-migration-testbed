package com.switchover.legacy.ejb.csr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface InnovationIdeaLocalHome extends EJBLocalHome {
    InnovationIdeaLocal create() throws CreateException;
}