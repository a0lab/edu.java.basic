package edu.java.basic;


import jdk.nashorn.internal.codegen.CompilerConstants;

import java.io.IOException;
import java.sql.SQLOutput;

public class HelloJava {

	
	public static void main(String[] args) throws IOException {

		// new JavaIO().readAndWriteBytes();
		if (args.length != 2) {
			System.out.println("Usage: java HelloJava <sourceFileName.ext> <destinationFileName.ext>");
			return;
		}
		new JavaIO().copyFile(args[0], args[1]);


	}
	// useGreet();
	// useCalculator();
	// useSlope();
	// usePyramid();
	// useStudent();

	// new ControlStructure().doWhileBreakCheckUrl();

//		ControlStructure cs = new ControlStructure();
//		cs.doWhileOddOrEven();




	public static void useGreet() {
		Greet g = new Greet();
		g.sayHello();
	}

	public static void useCalculator() {

		int a = 10, b = 6;
		Calculator calc = new Calculator();
		System.out.println(a + " + " + b + " = " + calc.add(a,b));
		System.out.println(a + " - " + b + " = " + calc.subsract(a,b));
		System.out.println(a + " X " + b + " = " + calc.multiply(a,b));
		System.out.println(a + " / " + b + " = " + calc.divide(a,b));
		System.out.println("sum of 5, 7, 13, 8 =" + calc.add(5,7,13,8));
		System.out.println("sum of 6, 8, 11, 9,7,3 =" + calc.add(new int[]{6,8,11,9,7,3}));
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
		pymd.printPyramid('$',20);
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


