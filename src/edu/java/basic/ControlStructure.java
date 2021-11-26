package edu.java.basic;

import java.util.Scanner;

public class ControlStructure {

    public void forExample() {
        int n = 10;
		for (int i = 5; i<=n; i++)
		    System.out.println("Index " + i);
    }

    public void whileOddOrEven() {
        // int sum = 0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        int number = 1;

        // while loop continues

        while (number > 0) {
            // add only positive numbers
            System.out.println("Enter a number");
            number = input.nextInt();
            int result = number % 2;
            if (result == 0)
                System.out.println(number + " is even number");
            else
                System.out.println(number + " is odd number");
        }
        input.close();
    }

    public void doWhileOddOrEven() {
        // int sum = 0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        int number = 1;

        // while loop continues
        System.out.println("Do While example");
        do {
            // add only positive numbers
            System.out.println("Enter a number(0 to quit");
            number = input.nextInt();
            int result = number % 2;
            if (number >0) {
                if (result == 0)
                    System.out.println(number + " is even number");
                else
                    System.out.println(number + " is odd number");
            }
            else
                System.out.println("Thank you for using S&J program");
        } while  (number > 0) ;
        input.close();
    }

    public void doWhileBreakOddOrEven() {
        // int sum = 0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        int number = 1;

        // while loop continues
        System.out.println("Do While with Break example");
        do {
            // add only positive numbers
            System.out.println("Enter a number");
            number = input.nextInt();
            int result = number % 2;
            if (number >0) {
                if (result == 0)
                    System.out.println(number + " is even number");
                else
                    System.out.println(number + " is odd number");
            }
            else {
                System.out.println("Thank you for using S&J program");
                break;
            }
        } while (true) ;
        input.close();
    }

    public void doWhileBreakCheckUrl() {
        // int sum = 0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        String url;

        // while loop continues
        System.out.println("Do While with Break example");
        do {
            // add only positive numbers
            System.out.println("Enter URL: (type 'quit' to exit)");
            url = input.nextLine();
            boolean result = this.isURL(url);
            if (url.equalsIgnoreCase("quit")) {
                System.out.println("Thank you for using S&J program");
                break;
            }
            else {
                if (result)
                    System.out.println(url + " is a valid url and LIVE");
                else
                    System.out.println(url + " is an INVALID url");
            }
        } while (true) ;
        input.close();
    }

    public void continueExample() {
        for (int i=1; i<=20; i++) {

            int result = i % 5;

            if (result == 0)
                continue;
            else
                System.out.println(i);
        }
    }

    public boolean isURL(String url) {
        try {
            (new java.net.URL(url)).openStream().close();
            return true;
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }


}
