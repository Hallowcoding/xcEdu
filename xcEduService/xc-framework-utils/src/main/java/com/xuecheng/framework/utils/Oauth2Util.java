package com.xuecheng.framework.utils;

import com.alibaba.fastjson.JSON;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Oauth2Util
 *
 * @author th
 * 2019/6/25 23:44
 **/
public class Oauth2Util {

    public static Map<String, String> getJwtClaimsFromHeader(HttpServletRequest request) {
        if(request == null) {
            return null;
        }

        //取出头信息
        String authorization = request.getHeader("Authorization");
        if (authorization.isEmpty() || authorization.indexOf("Bearer") < 0) {
            return null;
        }
        //从Bearer 后台开始取出token
        String token = authorization.substring(7);
        Map<String, String> map = null;
        try {
            //解析jwt
            Jwt decode = JwtHelper.decode(token);
            //得到jwt中的用户信息
            String claims = decode.getClaims();
            //将jwt转为map
            map = JSON.parseObject(claims, Map.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
