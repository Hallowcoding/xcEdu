package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

/**
 * CmsConfig
 *
 * @author th
 * 2019/6/25 19:35
 **/
@Data
@ToString
@Document(collection = "cms_config")
public class CmsConfig {

    @Id
    private String id;

    private String name;

    private List<CmsConfigModel> model;
}
