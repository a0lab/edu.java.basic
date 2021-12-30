package edu.java.basic;

class Circle extends Shape implements ShapeOperations {
    float radius;
    final float PI = 22f/7f;


    //Constructor overloading (method overloading - method with same name and different params)
    //Constructor 1
    Circle(float r) {
        this.radius = r;
        this.name = "Circle object";
    }
    // Constructor 2
    Circle(float r, String n) {
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
    public String toString(){
        return super.toString() + "\nClass Name: Circle";
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nClass ID:" + this.toString());
        sb.append("\nRadius:" + this.radius);
        sb.append("\nArea:" + this.getArea());
        sb.append("\nPerimeter:" + this.getPerimeter());
        sb.append("\n---------------------------------------------");
        return sb.toString();
    }
}
