package edu.java.basic;

public class Rectangle extends Shape implements ShapeOperations {

    int length;
    int width;

    //Constructor overloading (method overloading - method with same name and different params)
    //Constructor 1
    Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
        this.name = "Rectangle";
    }

    // Constructor 2
    Rectangle(int l, int w, String n) {
        this.length = l;
        this.width = w;
        this.name = n;
    }

    public float getArea() {
        float area = this.length * this.width;
        return area;
    }

    public float getPerimeter() {
        float perimeter = 2 * (this.length + this.width);
        return perimeter;
    }

    @Override
    public void print() {
        System.out.println("Name:" + this.name);
        System.out.println("Print Rectangle class:" + this.toString());
        System.out.println("Length:" + this.length);
        System.out.println("Width:" + this.width);
        System.out.println("Area:" + this.getArea());
        System.out.println("Perimeter:" + this.getPerimeter());
        System.out.println(this);
        System.out.println("---------------------------------------------");
    }

}
