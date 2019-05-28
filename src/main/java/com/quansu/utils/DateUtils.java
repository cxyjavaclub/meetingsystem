package com.quansu.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    /**
     * 将时间格式化字符串转为毫秒值
     *
     * @param format（String）
     * @param dateStr（String）
     * @return
     */
    public static Long dateFormatTurnTime(String format, String dateStr) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = formatter.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getTime();
    }

    /**
     * 将时间格式化字符串转为毫秒值（常用格式）
     *
     * @param dateStr（String）
     * @return
     */
    public static Long defaultDateFormatTurnTime(String dateStr) {
        return dateFormatTurnTime("yyyy-MM-dd HH:mm:ss", dateStr);
    }


    /**
     * 将日期格式为指定字符串格式并返回
     *
     * @param format
     * @param time
     * @return
     */
    public static String dateFormatTurnString(String format, Object time) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(time);
    }

    /**
     * 将日期格式为指定字符串格式并返回（常用的格式）
     *
     * @param time
     * @return
     */
    public static String defaultDateFormatTurnString(Object time) {
        return dateFormatTurnString("yyyy-MM-dd HH:mm:ss", time);
    }

    /**
     * 获取YYYY-MM-DD HH:mm:ss格式
     *
     * @return
     */
    public static String getTime() {
        return defaultDateFormatTurnString(new Date());
    }
}
