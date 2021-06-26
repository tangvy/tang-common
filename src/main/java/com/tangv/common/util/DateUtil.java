package com.tangv.common.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * author:   tangwei
 * Date:     2020/12/25 10:34
 * Description:
 */
public class DateUtil {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    /**
     * 指定时间戳
     */
    public static long getTimeStemp(LocalDateTime dateTime) {
        return dateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
    }

    /**
     * 当前时间戳
     */
    public static long getNowStemp() {
        return LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
    }

    /**
     * 当前时间格式化
     */
    public static String currentTime() {
        LocalDateTime now = LocalDateTime.now();
        String currentTime = now.format(formatter);
        return currentTime;
    }

}