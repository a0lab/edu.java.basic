package edu.java.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {
    public static void exampleDateTimeWithFormat() {
        LocalDate myDate = LocalDate.now();
        System.out.println("Current Date: " + myDate);

        LocalTime myTime = LocalTime.now();
        System.out.println("Current Time: " + myTime);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Current Date Time: " + myDateTime);

        DateTimeFormatter indianFormat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("1 Formatted date time: " + myDateTime.format(indianFormat1));

        DateTimeFormatter indianFormat2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");
        System.out.println("2 Formatted date time: " + myDateTime.format(indianFormat2));

        DateTimeFormatter indianFormat3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss");
        System.out.println("3 Formatted date time: " + myDateTime.format(indianFormat3));

        DateTimeFormatter indianFormat4 = DateTimeFormatter.ofPattern("MMMM dd, yyyy Q");
        System.out.println("4 Formatted date time Quarter: " + myDateTime.format(indianFormat4));

        DateTimeFormatter indianFormat5 = DateTimeFormatter.ofPattern("MMMM dd, yyyy G");
        System.out.println("5 Formatted date time with AD/BD: " + myDateTime.format(indianFormat5));

        DateTimeFormatter indianFormat6 = DateTimeFormatter.ofPattern("MMMM dd, yyyy w");
        System.out.println("6 Formatted date time with week no : " + myDateTime.format(indianFormat6));

        DateTimeFormatter indianFormat7 = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss a");
        System.out.println("7 Formatted date time AM/PM: " + myDateTime.format(indianFormat7));

        DateTimeFormatter indianFormat8 = DateTimeFormatter.ofPattern("e MMMM dd, yyyy hh:mm:ss a");
        System.out.println("8 Formatted date time DAY of WEEK: " + myDateTime.format(indianFormat8));

        DateTimeFormatter indianFormat9 = DateTimeFormatter.ofPattern("eee MMMM dd, yyyy hh:mm:ss a");
        System.out.println("9 Formatted date time: DAY of WEEK 3 letters: " + myDateTime.format(indianFormat9));

        DateTimeFormatter indianFormat10 = DateTimeFormatter.ofPattern("eeee MMMM dd, yyyy hh:mm:ss a");
        System.out.println("10 Formatted date time DAY of WEEK full: " + myDateTime.format(indianFormat10));
    }
}
