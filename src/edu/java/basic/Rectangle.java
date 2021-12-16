package edu.java.basic;

public class Rectangle extends Shape {

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

    public int getArea() {
        int area = this.length * this.width;
        return area;
    }

    public int getPerimeter() {
        int perimeter = 2 * (this.length + this.width);
        return perimeter;
    }

}
