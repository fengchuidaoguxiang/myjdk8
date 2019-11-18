package com.wjx.jdk8.lesson49;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.Date;

public class JodaTest {

    public static void main(String[] args) {
        DateTime today = new DateTime();
        DateTime tomorrow = today.plusDays(1);

        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(tomorrow.toString("yyyy-MM-dd"));
        System.out.println("------------------");
        DateTime d1 = today.withDayOfMonth(1);
        System.out.println(d1.toString("yyyy-MM-dd"));
        System.out.println("--------------");
        LocalDate localDate = new LocalDate();
        System.out.println(localDate);
        System.out.println("-----------------");
        localDate = localDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println(localDate);
        System.out.println("------------------");
        //计算2年前第3个月最后1天的日期
         DateTime dateTime = new DateTime();
         dateTime = dateTime.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMaximumValue();
        System.out.println(dateTime.toString("yyyy-MM-dd"));
    }
}
