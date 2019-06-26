package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;

/**
 * CmsPageParam
 *
 * @author th
 * 2019/6/25 19:58
 **/
@Data
@ToString
public class CmsPageParam {

    //参数名称
    private String pageParamName;

    //参数值
    private String pageParamValue;
}
