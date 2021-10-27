package edu.java.basic;

public class Pyramid {

    public void printPyramid() {
        int length = 10;
        for (int i=0; i<=length; i++) {
            for (int s=0; s<(length-i); s++)
                System.out.print(' ');
            for (int l=i-1; l>0; l--)
                System.out.print(l);
            for (int r=0; r<i; r++)
                System.out.print(r);
            System.out.println();
        }
    }

    public void printPyramid(char ch) {
        int length = 10;
        for (int i=0; i<length; i++) {
            for (int s=0; s<(length-i); s++)
                System.out.print(' ');
            for (int l=0; l<i; l++)
                System.out.print(ch);
            for (int r=0; r<i-1; r++)
                System.out.print(ch);
            System.out.println();
        }
    }

    public void printPyramid(char ch, int length) {
        for (int i=0; i<length; i++) {
            for (int s=0; s<(length-i); s++)
                System.out.print(' ');
            for (int l=0; l<i; l++)
                System.out.print(ch);
            for (int r=0; r<i-1; r++)
                System.out.print(ch);
            System.out.println();
        }
    }
}
