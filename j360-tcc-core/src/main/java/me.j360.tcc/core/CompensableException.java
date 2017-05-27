package me.j360.tcc.core;

/**
 * Package: me.j360.tcc.core
 * User: min_xu
 * Date: 2017/5/27 下午2:10
 * 说明：
 */
public class CompensableException extends RuntimeException {

    public CompensableException() {
        super();
    }

    public CompensableException(String message) {
        super(message);
    }

    public CompensableException(String message, Throwable cause) {
        super(message, cause);
    }

    public CompensableException(Throwable cause) {
        super(cause);
    }

}
