package com.diviner.exception.response;

/**
 * 相应 提示 异常
 * 该异常属于 用户操作操作不当 或 没有按照系统提示操作所产生的异常
 * 如：手机号格式不正确 ，
 *
 * 默认 code 300
 */
public class EasyeeResHintException extends EasyeeResException{
    {
        super.setCode(300);
    }

    public EasyeeResHintException(String message) {
        super(message);
    }

    public EasyeeResHintException(String message, Throwable cause) {
        super(message, cause);
    }

    public EasyeeResHintException(Throwable cause) {
        super(cause);
    }

    public EasyeeResHintException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    public EasyeeResHintException(Integer code, String message) {
        super(code, message);
    }

    public EasyeeResHintException(Integer code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public EasyeeResHintException(Integer code, Throwable cause) {
        super(code, cause);
    }

    public EasyeeResHintException(Integer code, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(code, message, cause, enableSuppression, writableStackTrace);
    }
}
