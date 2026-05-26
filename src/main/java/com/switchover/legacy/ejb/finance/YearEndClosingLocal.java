package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface YearEndClosingLocal extends EJBLocalObject {
    HashMap insertYearEndClosing(DefaultParameters param) throws DefaultEJBException;
    Collection selectYearEndClosingList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectYearEndClosingDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateYearEndClosing(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteYearEndClosing(DefaultParameters param) throws DefaultEJBException;
}