package edu.java.basic;

class Circle {
    int radius;
    String name;

    //Constructor overloading (method overloading - method with same name and different params)
    //Constructor 1
    Circle(int r) {
        this.radius = r;
        this.name = "Circle object";
    }
    // Constructor 2c
    Circle(int r, String n) {
        this.radius = r;
        this.name = n;
    }
}
