package edu.java.basic;

public class MathTable {

    public static void printMultiplicationTable(int tableNumber, int tableLength) {
        System.out.println("Multiplication Table "+ tableNumber + " is");

        for(int i=1; i<=tableLength; i++){
            System.out.println(i + " x " + tableNumber + "\t= " +(tableNumber*i));
        }
    }

}
