package edu.java.basic;

class Circle extends Shape implements ShapeOperations {
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

    @Override
    public void print() {
        System.out.println("Print Circle class:" + this.toString());
        System.out.println("Radius:" + this.radius);
        System.out.println("Name:" + this.name);
        System.out.println("Area:" + this.getArea());
        System.out.println("Perimeter:" + this.getPerimeter());
        System.out.println("---------------------------------------------");
    }
}
