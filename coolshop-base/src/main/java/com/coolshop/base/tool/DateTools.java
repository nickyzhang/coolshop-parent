package com.coolshop.base.tool;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class DateTools {

    private static ThreadLocal<DateFormat> dateFormat = new ThreadLocal<DateFormat>();

    public static LocalDateTime toLocalDateTime(String val) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.parse(val,formatter);
    }

    public static SimpleDateFormat getSimpleDateFormat(final String pattern){
        DateFormat df = dateFormat.get();
        if (df == null) {
            df = new SimpleDateFormat(pattern, Locale.getDefault());
            dateFormat.set(df);
        }
        return (SimpleDateFormat)df;
    }

    public static Date toDate(String val) {
        SimpleDateFormat format = getSimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return format.parse(val);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String toString(Date date) {
        SimpleDateFormat format = getSimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }
}
