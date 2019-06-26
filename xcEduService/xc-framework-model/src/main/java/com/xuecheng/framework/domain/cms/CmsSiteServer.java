package com.xuecheng.framework.domain.cms;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

/**
 * CmsSiteServer
 *
 * @author th
 * 2019/6/25 20:12
 **/
@Data
@ToString
@Document(collection = "cms_site_server")
public class CmsSiteServer {

    /**
     * 站点Id、服务器IP、端口、访问地址、服务器类型(代理、静态、动态、CDN)、资源发布地址(完整的HTTP接口)、使用类型(测试、生产)
     */

    //站点id
    private String siteId;
    //服务器id
    @Id
    private String serverId;
    //服务器ip
    private String ip;
    //端口
    private String port;
    //访问地址
    private String webPath;
    //服务器名称(代理、静态、动态、CDN)
    private String serverName;
    //资源发布地址(完整的HTTP接口)
    private String uploadPath;
    //使用类型(测试、生产)
    private String useType;
}
