package com.zheyuan.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author deng.zhang
 * @version 1.0.0
 * @date 2015-05-31 17:41
 */
public class DateUtil {
    private static final String DATE_FORMAT = "yyyy-MM-dd";
    public static String dateToStr(Date date) {
        String dateStr = "";
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            dateStr = dateFormat.format(date);
        }
        return dateStr;
    }
}
