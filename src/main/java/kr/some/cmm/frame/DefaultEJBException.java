package kr.some.cmm.frame;

/**
 * NTIS framework base exception for EJB business errors.
 */
public class DefaultEJBException extends Exception {
    public DefaultEJBException() {
        super();
    }
    public DefaultEJBException(String message) {
        super(message);
    }
    public DefaultEJBException(String message, Throwable cause) {
        super(message, cause);
    }
}

