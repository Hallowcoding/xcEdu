package com.xuecheng.framework.domain.cms.response;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import lombok.Data;

/**
 * CmsPageResult
 *
 * @author th
 * 2019/6/26 10:03
 **/
@Data
public class CmsPageResult extends ResponseResult {

    CmsPage cmsPage;

    public CmsPageResult(ResultCode resultCode, CmsPage cmsPage) {

        super(resultCode);
        this.cmsPage = cmsPage;
    }
}
