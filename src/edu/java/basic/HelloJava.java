package edu.java.basic;


import jdk.nashorn.internal.codegen.CompilerConstants;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloJava {

    public static void main(String[] args) throws Exception {

        Employee emp = new Employee("Sridhar");
        try {
            emp.setAge(255);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        System.out.println("Employee\n---------");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.getAge());


    } /* end of main method */

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
        Greet g = new Greet();
        int r = Integer.parseInt(g.readString("Enter radius"));

        Circle c = new Circle(r);
        System.out.println("Area= " + c.area());
        System.out.println("Circumference =	" + c.circumference());
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


