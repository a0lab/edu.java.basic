package edu.java.basic;

class Circle extends Shape {
    int radius;
    final float PI = 22f/7f;

    //Constructor overloading (method overloading - method with same name and different params)
    //Constructor 1
    Circle(int r) {
        this.radius = r;
        this.name = "Circle object";
    }
    // Constructor 2
    Circle(int r, String n) {
        this.radius = r;
        this.name = n;
    }

    public float getArea() {
        float area = this.PI * this.radius * this.radius;
        return area;
    }

    public float getPerimeter() {
        float perimeter = 2 * this.PI * this.radius;
        return perimeter;
    }
}
