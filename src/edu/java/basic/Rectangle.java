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
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nClass ID:" + this.toString());
        sb.append("\nLength:" + this.length);
        sb.append("\nWidth:" + this.width);
        sb.append("\nArea:" + this.getArea());
        sb.append("\nPerimeter:" + this.getPerimeter());
        sb.append("\n" + this);
        sb.append("\n---------------------------------------------");
        return sb.toString();
    }

}
