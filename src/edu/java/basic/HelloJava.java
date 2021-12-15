package edu.java.basic;

import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class HelloJava {

    public static void main(String[] args)  {

//        Scanner s = new Scanner(System.in);
//        int r = s.nextInt();

        Circle c1 = new Circle(25);
        Circle c2 = new Circle(35, "c2 ஒளி வட்டம்");
        Circle c3 = c2;
        c3.name = "c3 Oli vattam";

        float c1area = c1.getArea();

        System.out.println("Print Circle class:" + c1.toString());
        System.out.println("Radius:" + c1.radius);
        System.out.println("Name:" + c1.name);
        System.out.println("Area:" + c1area);
        System.out.println("Perimeter:" + c1.getPerimeter());

        System.out.println("Print Circle class:" + c2.toString());
        System.out.println("Radius:" + c2.radius);
        System.out.println("Name:" + c2.name);
        System.out.println("Area:" + c2.getArea());
        System.out.println("Perimeter:" + c2.getPerimeter());

        System.out.println("Print Circle class:" + c3.toString());
        System.out.println("Radius:" + c3.radius);
        System.out.println("Name:" + c3.name);
        System.out.println("Area:" + c3.getArea());
        System.out.println("Perimeter:" + c3.getPerimeter());
    }


    /* end of main method */

    // biggestOfArray()
    // biggestOfThree();
    // useGreet();
    // useCalculator();
    // useSlope();
    // usePyramid();
    // useStudent();

    // new ControlStructure().doWhileBreakCheckUrl();

    //	ControlStructure cs = new ControlStructure();
    //	cs.doWhileOddOrEven();

    public static void useArrayListAndLinkedList() {
        ArrayList<String> days = new ArrayList<String>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");


        System.out.println(days.get(2));

        HashMap<String, String> daysHM1 = new HashMap<String, String>();

        daysHM1.put("Sun","Sunday");
        daysHM1.put("Mon","Monday");
        daysHM1.put("Tue","Tuesday");
        daysHM1.put("Wed","Wednesday");
        daysHM1.put("Thu","Thursday");
        daysHM1.put("Fri","Friday");
        daysHM1.put("Sat","Saturday");


        System.out.println(daysHM1.get("Wed"));

        HashMap<Integer, String> daysHM2 = new HashMap<Integer, String>();

        daysHM2.put(1,"Sunday");
        daysHM2.put(2,"Monday");
        daysHM2.put(3,"Tuesday");
        daysHM2.put(4,"Wednesday");
        daysHM2.put(5,"Thursday");
        daysHM2.put(6,"Friday");
        daysHM2.put(7,"Saturday");


        System.out.println(daysHM2.get(6));

        System.out.println(days);
        System.out.println(daysHM1);
        System.out.println(daysHM2);
        days.clear();
        System.out.println(days);

        for (String i : daysHM1.keySet()) {
            System.out.println(i);
        }

        for (String i : daysHM1.values()) {
            System.out.println(i);
        }

        daysHM1.clear();
        System.out.println(daysHM1);
        System.out.println(daysHM2.size());


        daysHM2.remove(3);
        System.out.println(daysHM2);
        System.out.println(daysHM2.get(13));
    }

    public static void useTimeZone() {
        ZonedDateTime tokyoDateTime = ZonedDateTime.now();
        System.out.println("Before formatting: " + tokyoDateTime);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMMM dd, yyyy hh:mm:ss a z");

        String formattedDate = tokyoDateTime.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        //Print date time in India
        ZonedDateTime india = tokyoDateTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("India: " + india);
        System.out.println("India formatted: " + india.format(myFormatObj));
    }

    public static void useEmployee() {
        Employee emp = new Employee("Sridhar");
        try {
            emp.setAge(255);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        System.out.println("Employee\n---------");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.getAge());
    }

    public static void useRectangle() {
        Rectangle rect = new Rectangle(50, 30);
        rect.length = 55;

        System.out.println("Rectangle\n---------");
        System.out.println("Length: " + rect.length);
        System.out.println("Width: " + rect.width);
        System.out.println("Area: " + rect.area());
    }

    public static void copyFile(String[] args) {
        //Copy file from arg1 to arg2
        try {
            new JavaIO().readBytes();
            new JavaIO().readAndWriteBytes();
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex);
        }
        if (args.length != 2) {
            System.out.println("Usage: java HelloJava <sourceFileName.ext> <destinationFileName.ext>");
            return;
        }
        new JavaIO().copyFile(args[0], args[1]);
    }

    public static void stringReverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");

        String input = scanner.nextLine();

        System.out.println("Reversed String : " + StringUtil.reverse(input));
    }

    public static void biggestOfArray() {
        Scanner sc = new Scanner(System.in);
        //reading input from the user

        System.out.println("Enter Total count:");
        int n = sc.nextInt();


        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + i + ":");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Entered number " + i + ":" + a[i]);
        }
        //int bigIndex = ArrayUtil.indexOfBiggestNumber(a);
        //System.out.println("Biggest element is a[" + bigIndex + "]");
        //System.out.println("Biggest number is " + a[bigIndex]);

        int[] bigIndex = ArrayUtil.indexOfBiggestThreeNumbers(a);
        for (int i = 0; i < bigIndex.length; i++) {
            System.out.print("Biggest element:value is a[" + bigIndex[i] + "]");
            System.out.println(":" + a[bigIndex[i]]);
        }
    }

    public static void biggestOfThree() {
        int a, b, c, largest, temp;
        //object of the Scanner class
        Scanner sc = new Scanner(System.in);
        //reading input from the user

        System.out.println("Enter A:");
        a = sc.nextInt();

        System.out.println("Enter B:");
        b = sc.nextInt();

        System.out.println("Enter C:");
        c = sc.nextInt();

        if (a > b) {  // compare A with B
            // A is bigger
            if (a > c) {  // Compare A with C
                // A is bigger
                System.out.println("A is bigger");
            } else {
                // C is bigger
                System.out.println("C is bigger");
            }
        } else {
            // B is bigger
            if (b > c) {  // Compare B with C
                // B is bigger
                System.out.println("B is bigger");
            } else {
                // C is bigger
                System.out.println("C is bigger");
            }
        }
    }

    public static void useGreet() {
        Greet g = new Greet();
        g.sayHello();
    }

    public static void useCalculator() {

        int a = 10, b = 6;
        Calculator calc = new Calculator();
        System.out.println(a + " + " + b + " = " + calc.add(a, b));
        System.out.println(a + " - " + b + " = " + calc.subsract(a, b));
        System.out.println(a + " X " + b + " = " + calc.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calc.divide(a, b));
        System.out.println("sum of 5, 7, 13, 8 =" + calc.add(5, 7, 13, 8));
        System.out.println("sum of 6, 8, 11, 9,7,3 =" + calc.add(new int[]{6, 8, 11, 9, 7, 3}));
    }

    public static void useSlope() {
        Slope sl = new Slope();
        sl.printSlopeDown();
//		sl.printSlopeDown('*');
//		sl.printSlopeDown('$',100);
//		sl.printSlopeUp('*',10);

    }

    public static void usePyramid() {
        Pyramid pymd = new Pyramid();
        pymd.printPyramid('*');
        pymd.printPyramid();
        pymd.printPyramid('$', 20);
    }

    public static void useCircle() {
//        Greet g = new Greet();
//        int r = Integer.parseInt(g.readString("Enter radius"));
//
//        Circle c = new Circle(r);
//        System.out.println("Area= " + c.area());
//        System.out.println("Circumference =	" + c.circumference());
    }

    public static void useStudent() {
        Student s = new Student("Jayaraman");

        System.out.println(s.getGrade(91));
        System.out.println(s.getGrade(76));
        System.out.println(s.getGrade(66));
        System.out.println(s.getGrade(35));
        System.out.println(s.getGrade(34));

        System.out.println(s.getGradeText(91));
        System.out.println(s.getGradeText(76));
        System.out.println(s.getGradeText(66));
        System.out.println(s.getGradeText(35));
        System.out.println(s.getGradeText(34));
    }

}


