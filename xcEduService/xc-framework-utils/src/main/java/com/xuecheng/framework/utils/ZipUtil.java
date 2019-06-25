package com.xuecheng.framework.utils;

import net.lingala.zip4j.core.ZipFile;

/**
 * ZipUtil
 *
 * @author th
 * 2019/6/26 0:17
 **/
public class ZipUtil {

    /**
     * 解压zip文件
     * @param zipFilePath
     * @param targetPath
     * @throws Exception
     */
    public static void unzip(String zipFilePath, String targetPath) throws Exception {

        ZipFile zipFile = new ZipFile(zipFilePath);
        zipFile.extractAll(targetPath);
    }

    /**
     * 解压zip文件(带密码)
     * @param zipFilePath
     * @param password
     * @param targetPath
     * @throws Exception
     */
    public static void unzip(String zipFilePath, String password, String targetPath) throws Exception {

        ZipFile zipFile = new ZipFile(zipFilePath);
        if (zipFile.isEncrypted()) {
            zipFile.setPassword(password);
        }
        zipFile.extractAll(targetPath);
    }
}
