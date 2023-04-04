package com.itany.zshop.common.util;

import org.apache.commons.net.ftp.*;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Author：汤小洋
 * Date：2018-05-09 15:07
 * Description：<描述>
 */
public class FtpUtils {

    FTPClient ftp = new FTPClient();
    private String ftpPath = "/";
    /**
     * 切换目录
     *
     * @param path
     *            需要切换的目录
     * @param forcedIncrease
     *            如果目录不存在，是否增加
     */
    public void switchDirectory(String path, boolean forcedIncrease) {
        try {
            if (path != null && !"".equals(path)) {
                boolean ok = ftp.changeWorkingDirectory(path);
                if (ok) {
                    this.ftpPath = path;
                } else if (forcedIncrease) {
                    // ftpPath 不存在，手动创建目录
                    StringTokenizer token = new StringTokenizer(path, "\\//");   //构造一个用来解析 str 的 StringTokenizer 对象，并提供一个指定的分隔符。
                    while (token.hasMoreTokens()) {
                        String npath = token.nextToken();
                        ftp.makeDirectory(npath);
                        ok=ftp.changeWorkingDirectory(npath);
                        if (ok) {
                            this.ftpPath = path;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Description: 向FTP服务器上传文件
     *
     * @param host     FTP服务器hostname
     * @param port     FTP服务器端口
     * @param username FTP登录账号
     * @param password FTP登录密码
     * @param basePath FTP服务器基础目录
     * @param filePath FTP服务器文件存放路径。例如分日期存放：/2015/01/01。文件的路径为basePath+filePath
     * @param filename 上传到FTP服务器上的文件名
     * @param input    输入流
     * @return 成功返回true，否则返回false
     */
    public static boolean uploadFile(String host, int port, String username, String password, String basePath,
                                     String filePath, String filename, InputStream input) {
        boolean result = false;
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(host, port);// 连接FTP服务器
            // 如果采用默认端口，可以使用ftp.connect(host)的方式直接连接FTP服务器
            ftp.login(username, password);// 登录
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                return result;
            }

            //切换到上传目录
            if (!ftp.changeWorkingDirectory(basePath + filePath)) {
                //如果目录不存在创建目录
                String[] dirs = filePath.split("/");
                String tempPath = basePath;
                for (String dir : dirs) {
                    if (null == dir || "".equals(dir)) continue;
                    tempPath += "/" + dir;
                    if (!ftp.changeWorkingDirectory(tempPath)) {
                        if (!ftp.makeDirectory(tempPath)) {
                            return result;
                        } else {
                            ftp.changeWorkingDirectory(tempPath);
                        }
                    }
                }
            }
            FTPClientConfig config = new FTPClientConfig(ftp.getSystemType().split(" ")[0]);
            System.out.println("ftp.getSystemType::::"+ftp.getSystemType());
            config.setServerLanguageCode("zh");
            ftp.configure(config);
            // 使用被动模式设为默认
            ftp.enterLocalPassiveMode();
            // 二进制文件支持
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            // 设置模式
            ftp.setFileTransferMode(FTP.STREAM_TRANSFER_MODE);
            //上传文件
            if (!ftp.storeFile(filename, input)) {
                return result;
            }
            input.close();
            ftp.logout();
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return result;
    }

    /**
     * Description: 从FTP服务器下载文件
     *
     * @param host       FTP服务器hostname
     * @param port       FTP服务器端口
     * @param username   FTP登录账号
     * @param password   FTP登录密码
     * @param remotePath FTP服务器上的相对路径
     * @param fileName   要下载的文件名
     * @param localPath  下载后保存到本地的路径
     * @return
     */
    public static boolean downloadFile(String host, int port, String username, String password, String remotePath,
                                       String fileName, String localPath) {
        boolean result = false;
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(host, port);
            // 如果采用默认端口，可以使用ftp.connect(host)的方式直接连接FTP服务器
            ftp.login(username, password);// 登录
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                return result;
            }
            ftp.changeWorkingDirectory(remotePath);// 转移到FTP服务器目录
            FTPFile[] fs = ftp.listFiles();
            for (FTPFile ff : fs) {
                if (ff.getName().equals(fileName)) {
                    File localFile = new File(localPath + "/" + ff.getName());

                    OutputStream is = new FileOutputStream(localFile);
                    ftp.retrieveFile(ff.getName(), is);
                    is.close();
                }
            }

            ftp.logout();
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
        return result;
    }
}