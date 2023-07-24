package com.program.exception;

public class BusinessExcption extends RuntimeException{
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BusinessExcption(String code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessExcption(String code ,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
