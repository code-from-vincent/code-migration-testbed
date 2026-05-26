package kr.some.cmm.util;

import java.util.HashMap;

/**
 * NTIS framework parameter container passed to EJB methods.
 * Carries HTTP request parameters from the Action layer to the EJB layer.
 */
public class DefaultParameters extends HashMap<String, Object> {
    public DefaultParameters() {
        super();
    }

    public String getString(String key) {
        Object val = get(key);
        return val == null ? null : val.toString();
    }
}

