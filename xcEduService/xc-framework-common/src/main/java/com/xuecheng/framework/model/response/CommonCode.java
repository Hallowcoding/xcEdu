package com.xuecheng.framework.model.response;

import lombok.ToString;

/**
 * CommonCode
 *
 * @author th
 * 2019/6/25 1:01
 **/
@ToString
public enum CommonCode implements ResultCode {

    INVALID_PARAM(false, 10003, "非法参数！"),
    SUCCESS(true,10000,"操作成功！"),
    FAIL(false,11111,"操作失败！"),
    UNAUTHENTICATED(false,10001,"此操作需要登陆系统！"),
    UNAUTHORISE(false,10002,"权限不足，无权操作！"),
    SERVER_ERROR(false,99999,"抱歉，系统繁忙，请稍后重试！"),
    ;

    /** 操作是否成功*/
    boolean success;

    /** 操作代码*/
    int code;

    /** 提示信息*/
    String message;

    private CommonCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return false;
    }

    @Override
    public int code() {
        return 0;
    }

    @Override
    public String message() {
        return null;
    }
}
