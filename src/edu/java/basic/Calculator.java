package edu.java.basic;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int add(int...n) {
        int sum = 0;
        for (int i = 0; i< n.length;i++)
            sum = sum + n[i];
        return sum;
    }

    public int subsract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public float divide(int a, int b){
        return (float) a / b;
    }
}
