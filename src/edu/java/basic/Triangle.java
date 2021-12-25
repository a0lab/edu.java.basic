package edu.java.basic;

public class Triangle extends Shape implements ShapeOperations {

    int a, b, c, h;
    final float div = 1f/2f;

    //constructor overloading method (mathed with same name and different parameters)
    //			constructor 1
    Triangle(int a, int b, int c, int h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.name = "Triangle";
    }

    //		constructor 2
    Triangle(int a, int b, int c, int h, String n){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.name = n;
    }

    public float getArea(){
        float area = this.div * (this.b * this.h);
        return area;
    }
    public float getPerimeter(){
        float perimeter = this.a + this.b + this.c;
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("Class ID:" + this.toString());
        System.out.println("length = " + this.b);
        System.out.println("height = " + this.h);
        System.out.println("Area = " + this.getArea());
        System.out.println("Perimeter = " + this.getPerimeter());
        System.out.println("---------------------------------------------");
    }

}
