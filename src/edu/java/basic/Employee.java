package edu.java.basic;

public class Employee {
    String name;
    private int age;

    // Getter
    public int getAge() {
        return this.age;
    }

    // Setter
    public void setAge(int newAge) throws Exception {
        if ( newAge>17 && newAge <121)
            this.age = newAge;
        else
            throw new Exception("Invalid age " + newAge);
    }
    public Employee(String empName) {
        this.name = empName;
    }
}
