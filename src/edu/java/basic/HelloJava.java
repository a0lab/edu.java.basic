package edu.java.basic;
import io.jpm.bm.util.MagicNumber;

import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HelloJava {

    public static void main(String[] args)  {

        // useCircle2();
        useRectangle();

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

    public static void useGenericExample() {
        Integer[] a = {57,86,19,48,72};
        Float[] b = {57.3f,86.7f,19f,48.9f,72f};
        String[] s = {"Jayaraman", "Ulaganathan", "Sridhar", "Veera", "Anand"};

        Float max = GArrayUtil.max(b);
        Integer min = GArrayUtil.min(a);
        System.out.println("min:" + min);
        System.out.println("Max:" + max);
        System.out.println("String max:" + GArrayUtil.max(s));
        System.out.println("String min:" + GArrayUtil.min(s));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(s));
        GArrayUtil.printArray(a);
        GArrayUtil.printArray(b);
        GArrayUtil.printArray(s);
    }

    public static void examplePolimorphism() {
        Circle c = new Circle(35, "c2 ஒளி வட்டம்");
        Triangle t = new Triangle(15, 4, 6, 55, "Jayaraman");
        Rectangle r = new Rectangle(35,75, "செவ்வகம்");

        c.print();
        t.print();
        r.print();
    }

    public static void useMagicNumber() {
        //Convert Number to word
        Scanner s = new Scanner(System.in);
        MagicNumber mn = new MagicNumber();

        do {
            System.out.println("TYPE 0 to EXIT program. Enter NUMBER to Convert:");
            mn.number = s.nextFloat();
            System.out.println("---------------------------------------------------------");
            System.out.println("NUMBER: " + mn.number);
            System.out.println("WORDS : " + mn.toWord());
            System.out.println("---------------------------------------------------------");
        } while (mn.number != 0);
    }

    public static void useEnumType() {

//        System.out.println("List of India States and it's Capital city");
//        System.out.println("------------------------------------------");
//        System.out.println("STATE \t CAPITAL CITY");
//        System.out.println("------------------------------------------");
//        int i = 0;
//        for (IndiaState state: IndiaState.values()) {
//            System.out.println(state.ordinal()+1 + " " + state + "\t" + state.getCapital());
//        }
//        System.out.println("------------------------------------------");

        IndiaState tn = IndiaState.Maharashtra;
        System.out.println(tn);
        System.out.println(tn.getCapital());
        System.out.println(tn.ordinal());
        System.out.println("Language");
        switch (tn) {
            case TamilNadu:
                System.out.println("Tamil");
                break;
            case AndhraPradesh:
                System.out.println("Telugu");
                break;
            case Karnataka:
                System.out.println("Kannada");
                break;
            case Kerala:
                System.out.println("Malayalam");
                break;
            default:
                System.out.println("Unknown");
        }
    }

    public static void useEBCalculator()  {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter account name:");
        String accountName = s.nextLine();
        System.out.println("Enter meter reading:");
        int r = s.nextInt();

        EBCalc eb = new EBCalc(accountName,0);

        eb.printBill();
        eb.setMeterReading(r);
        eb.generateBill();
        eb.printBill();

    }

    public static void useMultiplicationTable() {
        int n, length;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Multiplication Table Number");
        n = input.nextInt();
        System.out.println("Enter the upto Number");
        length = input.nextInt();
        MathTable.printMultiplicationTable(n,length);
    }

    public static void useTriangle() {
        Triangle[] triArray = new Triangle[4];

        triArray[0]= new Triangle(10, 16, 14, 23);
        triArray[1]= new Triangle(15, 4, 6, 55, "Jayaraman");
        triArray[2]= new Triangle(15, 44, 76, 45, "Sridhar");
        triArray[3]= new Triangle(15, 47, 25, 55, "Ulaganatan");

        for(Triangle tr: triArray){
            tr.print();
        }
    }

    public static void useRectangle2() {
        Rectangle[] rectArray = new Rectangle[4];

        rectArray[0] = new Rectangle(25,35);
        rectArray[1]= new Rectangle(35,75, "செவ்வகம்");
        rectArray[2]= new Rectangle(343,755, "ஸ்ரீதர்");
        rectArray[3]= new Rectangle(85,934, "உலகநாதன்");
        //Circle c3 = c2;
        //c3.name = "c3 Oli vattam";

        //float c1area = c1.getArea();
        for (Rectangle r: rectArray) {
            System.out.println("Name:" + r.name);
            System.out.println("Print Rectangle class:" + r.toString());
            System.out.println("Length:" + r.length);
            System.out.println("Width:" + r.width);
            System.out.println("Area:" + r.getArea());
            System.out.println("Perimeter:" + r.getPerimeter());
            System.out.println(r);
            System.out.println("---------------------------------------------");
        }
    }

    public static void useCircle2() {
        Circle c1 = new Circle(25);
        Circle c2 = new Circle(35.47f, "c2 ஒளி வட்டம்");
        Circle c3 = c2;
        c3.name = "c3 Oli vattam";

        float c1area = c1.getArea();
        String outputString;
        outputString = c1.print();
        System.out.println(outputString);

        System.out.println(c2.print());
        System.out.println(c3.print());

        System.out.println("c1 equals c2: " + c1.equals(c2));
        System.out.println("c1 equals c3: " + c1.equals(c3));
        System.out.println("c2 equals c3: " + c2.equals(c3));
    }

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
        System.out.println("Area: " + rect.getArea());

        System.out.println(rect.print());
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
        // scan all n numbers
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + i + ":");
            a[i] = sc.nextInt();
        }
        // print all scanned numbers
        for (int i = 0; i < n; i++) {
            System.out.println("Entered number " + i + ":" + a[i]);
        }

        int bigIndex = ArrayUtil.indexOfBiggestNumber(a);
        System.out.println("Biggest element is a[" + bigIndex + "]");
        System.out.println("Biggest number is " + a[bigIndex]);

        int[] bigIndexArray = ArrayUtil.indexOfBiggestThreeNumbers(a);
        for (int i = 0; i < bigIndexArray.length; i++) {
            System.out.print("Biggest element:value is a[" + bigIndexArray[i] + "]");
            System.out.println(":" + a[bigIndexArray[i]]);
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


