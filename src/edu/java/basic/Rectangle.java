package edu.java.basic;

public class Rectangle {
    int length;
    int width;

    public Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public int area() {
        return this.length * this.width;
    }
}
