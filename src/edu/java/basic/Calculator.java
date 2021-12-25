package edu.java.basic;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }
    public long add(long a, long b){
        return a + b;
    }
    public float add(float a, float b) { return a +b; }
    public String add(String a, String b) { return a + b; }

    public int add(int a, int b, int c){
        return a + b + c;
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
