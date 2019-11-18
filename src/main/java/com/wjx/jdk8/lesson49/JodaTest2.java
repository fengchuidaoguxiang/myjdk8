package com.wjx.jdk8.lesson49;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.sql.SQLOutput;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JodaTest2 {

    //标准UTC时间格式：2014-11-04T09:22:54.876Z
    public static Date convertUTC2Date( String utcDate ){
        try{
            DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
            return dateTime.toDate();
        }catch ( Exception e ){
            return null;
        }
    }

    //
    public static String convertDate2UTC( Date javaDate ){
        DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }

    public static String convertDate2LocalByDateFormat( Date javaDate, String dateFormat ){
        DateTime dateTime = new DateTime(javaDate);
        return dateTime.toString(dateFormat);
    }

    public static void main(String[] args) {
        System.out.println(JodaTest2.convertUTC2Date("2014-11-04T09:22:54.876Z"));
        System.out.println(JodaTest2.convertDate2UTC(new Date()));
        System.out.println(new Date());
        System.out.println(JodaTest2.convertDate2LocalByDateFormat(new Date(),"yyyy-MM-dd HH:mm:ss"));

    }

}
