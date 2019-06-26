package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 * CmsTemplate
 *
 * @author th
 * 2019/6/25 20:18
 **/
@Data
@ToString
@Document(collection = "cms_template")
public class CmsTemplate {

    //站点ID
    private String siteId;
    //模板ID
    @Id
    private String templateId;
    //模板名称
    private String templateName;
    //模板参数
    private String templateParameter;
    //模板文件Id
    private String templateFileId;
}
