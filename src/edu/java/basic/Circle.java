package edu.java.basic;

public class Circle {
    int radius;

    // Constructor
    Circle(int r) {
        this.radius = r;
    }

    public float area() {
        float area = 22f / 7f * radius * radius;
        return area;
    }

    public float circumference() {
        float circum = 2 * 22f / 7f * radius;
        return  circum;
    }
}
