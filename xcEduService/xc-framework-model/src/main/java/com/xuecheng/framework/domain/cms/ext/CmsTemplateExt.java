package com.xuecheng.framework.domain.cms.ext;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import lombok.Data;
import lombok.ToString;

/**
 * CmsTemplateExt
 *
 * @author th
 * 2019/6/26 9:43
 **/
@Data
@ToString
public class CmsTemplateExt extends CmsTemplate {

    /** 模板内容*/
    private String templateValue;
}
