package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
 * CmsConfigModel
 *
 * @author th
 * 2019/6/25 19:38
 **/
@Data
@ToString
public class CmsConfigModel {

    private String key;

    private String name;

    private String url;

    private Map mapValue;

    private String value;
}
