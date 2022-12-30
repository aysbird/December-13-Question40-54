package org.Homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class QUESTION3 {


    public static void main(String[] args) {
        String date;
        date = LocalDate
                .parse ("2014-05-04")
                .format (DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }
}
   //output order : D.An exception is thrown at runtime.
