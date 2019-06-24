package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * CustomException
 *
 * 自定义异常类型
 * @author th
 * 2019/6/25 0:08
 **/
public class CustomException extends RuntimeException {

    /** 错误代码 */
    ResultCode resultCode;

    public CustomException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
