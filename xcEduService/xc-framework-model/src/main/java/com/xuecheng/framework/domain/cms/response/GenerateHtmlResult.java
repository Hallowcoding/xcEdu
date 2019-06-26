package com.xuecheng.framework.domain.cms.response;

import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import lombok.Data;

/**
 * GenerateHtmlResult
 *
 * @author th
 * 2019/6/26 9:56
 **/
@Data
public class GenerateHtmlResult extends ResponseResult {

    String html;

    public GenerateHtmlResult(ResultCode resultCode, String html) {
        super(resultCode);
        this.html = html;
    }
}
