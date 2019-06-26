package com.xuecheng.framework.domain.cms.ext;

import com.xuecheng.framework.domain.cms.CmsPage;
import lombok.Data;
import lombok.ToString;

/**
 * CmsPageExt
 *
 * @author th
 * 2019/6/26 9:42
 **/
@Data
@ToString
public class CmsPageExt extends CmsPage {

    private String htmlValue;
}
