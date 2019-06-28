package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * QueryPageRequest
 *
 * @author th
 * 2019/6/26 9:46
 **/
@Data
public class QueryPageRequest extends RequestData {

    //接收页面查询的查询条件
    //站点Id
    @ApiModelProperty("站点id")
    private String siteId;
    //页面Id
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模板Id
    private String templateId;
}
