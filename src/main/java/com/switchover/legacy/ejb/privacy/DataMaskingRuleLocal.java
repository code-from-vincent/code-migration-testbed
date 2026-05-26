package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DataMaskingRuleLocal extends EJBLocalObject {
    HashMap insertDataMaskingRule(DefaultParameters param) throws DefaultEJBException;
    Collection selectDataMaskingRuleList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDataMaskingRuleDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDataMaskingRule(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDataMaskingRule(DefaultParameters param) throws DefaultEJBException;
}