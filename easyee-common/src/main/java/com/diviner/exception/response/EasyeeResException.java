package com.diviner.exception.response;

import com.diviner.exception.EasyeeException;

/**
 * 相应根异常
 *
 * 默认 code 500
 */
public class EasyeeResException extends EasyeeException {
    private Integer code;
    {
        this.setCode(500);
    }

    public EasyeeResException(String message) {
        super(message);
    }

    public EasyeeResException(String message, Throwable cause) {
        super(message, cause);
    }

    public EasyeeResException(Throwable cause) {
        super(cause);
    }

    public EasyeeResException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public EasyeeResException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public EasyeeResException(Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public EasyeeResException(Integer code,Throwable cause) {
        super(cause);
        this.code = code;
    }

    public EasyeeResException(Integer code,String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
