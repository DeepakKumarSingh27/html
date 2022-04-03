package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_datetime_formatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyy -- E H:m:s a ");
        DateTimeFormatter df2= DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate2=dt.format(df2);
        System.out.println(myDate2);
        String myDate=dt.format(df);
        System.out.println(myDate);
    }
}
