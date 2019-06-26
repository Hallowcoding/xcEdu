package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * CmsPage
 *
 * @author th
 * 2019/6/25 19:45
 **/
@Data
@ToString
@Document(collection = "cms_page")
public class CmsPage {

    /**
     * 页面名称、别名、访问地址、类型(静态/动态)、页面模板、状态
     */
    //站点Id
    private String siteId;
    //页面ID
    @Id
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //访问地址
    private String pageWebPath;
    //参数
    private String pageParameter;
    //物理路径
    private String pagePhysicalPath;
    //类型(静态/动态)
    private String pageType;
    //页面模板
    private String pageTemplate;
    //页面静态化内容
    private String pageHtml;
    //状态
    private String pageStatus;
    //创建时间
    private Date pageCreateTime;
    //模板Id
    private String templateId;
    //参数列表
    private List<CmsPageParam> pageParams;
    //模板文件Id
//    private String templateFileId;
    //静态文件Id
    private String htmlFileId;
    //数据Url
    private String dataUrl;
}
