package com.taba.apigateway.exceptionHandler;

public class athenticateException extends  Exception{
    public athenticateException()    {

    }
    public athenticateException(String message) {
        super(message);
    }

    public athenticateException(String message, Throwable cause) {
        super(message, cause);
    }

    public athenticateException(Throwable cause) {
        super(cause);
    }

    public athenticateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
