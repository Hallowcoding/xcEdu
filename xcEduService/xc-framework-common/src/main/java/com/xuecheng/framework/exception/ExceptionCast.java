package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * ExceptionCast
 *
 * @author th
 * 2019/6/25 1:22
 **/
public class ExceptionCast {

    public static void cast(ResultCode resultCode) {

        throw new CustomException(resultCode);
    }
}
