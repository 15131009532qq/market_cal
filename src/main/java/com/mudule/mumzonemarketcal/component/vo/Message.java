package com.mudule.mumzonemarketcal.component.vo;

/**
 * @Description
 * @ClassName Message
 * @Autor DZT
 * @Date 2019/3/12 15:27
 * @Version 1.0
 */
public class Message {

    public static final Integer HELLO = 0;
    public static final Integer GOODBYE = 1;

    private String message;

    private Integer status;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
