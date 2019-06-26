package com.xuecheng.framework.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * BCryptUtil
 *
 * @author th
 * 2019/6/26 0:23
 **/
public class BCryptUtil {

    public static String encode(String password) {

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashPass = passwordEncoder.encode(password);

        return hashPass;
    }

    public static boolean matches(String password, String hashPass) {

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        boolean result = passwordEncoder.matches(password, hashPass);

        return result;
    }
}
