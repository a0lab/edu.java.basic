package edu.java.basic;

public class Slope {

    public void printSlopeDown() {
        for (int i=0; i<10; i++) {
            for (int j=0; j<=i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
    public void printSlopeDown(char ch) {
        for (int i=0; i<10; i++) {
            for (int j=0; j<=i; j++)
                System.out.print(ch);
            System.out.println();
        }
    }
    public void printSlopeDown(char ch, int length) {
        for (int i=0; i<length; i++) {
            for (int j=0; j<=i; j++)
                System.out.print(ch);
            System.out.println();
        }
    }
    public void printSlopeUp(char ch, int length) {
        for (int i=0; i<length; i++) {
            for (int s=0; s<(length-i); s++)
                System.out.print(' ');
            for (int j=0; j<=i; j++)
                System.out.print(ch);
            System.out.println();
        }
    }
}
