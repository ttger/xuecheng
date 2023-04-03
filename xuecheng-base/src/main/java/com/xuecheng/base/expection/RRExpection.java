package com.xuecheng.base.expection;


/**
 * 自定义异常
 */
public class RRExpection extends RuntimeException{
    private String msg;

    public RRExpection(String message) {
        super(message);
    }
}
