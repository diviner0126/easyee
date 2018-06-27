package com.diviner.exception;

/**
 * 项目内业务相关的根异常
 *
 */
public class EasyeeException extends RuntimeException{
    public EasyeeException() {
    }

    public EasyeeException(String message) {
        super(message);
    }

    public EasyeeException(String message, Throwable cause) {
        super(message, cause);
    }

    public EasyeeException(Throwable cause) {
        super(cause);
    }

    public EasyeeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
