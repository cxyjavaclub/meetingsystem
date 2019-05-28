package com.quansu.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 短信宝发送短信接口
 * @author cxy
 * @date 2019/5/26
 */

public class SmsSampleUtils {

    /**
     * 在短信宝注册的用户名
     */
    static String userName = "testcxy";
    /**
     * 在短信宝注册的密码
     */
    static String password = "2513063503";

    /**
     * 短信宝接口
     */
    static String httpUrl = "http://api.smsbao.com/sms";

    public static void main(String[] args) {
        String testPhone = "18896988620";
        /**
         * 注意测试时，也请带上公司简称或网站签名，发送正规内容短信。千万不要发送无意义的内容：例如 测一下、您好。否则可能会收不到
         */
        String testContent = "【万千购】邀你参加会议。若非本人操作请忽略此消息。";

        System.out.println(sendNote(testPhone, testContent));
    }

    /**
     *
     * @param phone
     * @param content
     * @return
     */
    public static String sendNote(String phone, String content){
        StringBuffer httpArg = new StringBuffer();
        httpArg.append("u=").append(userName).append("&");
        httpArg.append("p=").append(md5(password)).append("&");
        httpArg.append("m=").append(phone).append("&");
        httpArg.append("c=").append(encodeUrlString(content, "UTF-8"));
        return request(httpUrl, httpArg.toString());
    }

    public static String request(String httpUrl, String httpArg) {
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        httpUrl = httpUrl + "?" + httpArg;
        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = reader.readLine();
            if (strRead != null) {
                sbf.append(strRead);
                while ((strRead = reader.readLine()) != null) {
                    sbf.append("\n");
                    sbf.append(strRead);
                }
            }
            reader.close();
            result = sbf.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String md5(String plainText) {
        StringBuffer buf = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();
            int i;
            buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return buf.toString();
    }

    public static String encodeUrlString(String str, String charset) {
        String strret = null;
        if (str == null) {
            return str;
        }
        try {
            strret = java.net.URLEncoder.encode(str, charset);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return strret;
    }
}
