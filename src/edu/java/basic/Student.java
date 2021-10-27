package edu.java.basic;

public class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }
    public char getGrade(int mark) {

        if (mark > 90) {
            return 'A';
        }
        else if (mark > 75) {
            return 'B';
        }
        else if (mark > 65) {
            return 'C';
        }
        else if (mark >= 35) {
            return 'P';
        }
        else {
            return 'F';
        }
    }

    public String getGradeText(int mark) {

        if (mark > 90) {
            return "Grade A";
        }
        else if (mark > 75) {
            return "Grade B";
        }
        else if (mark > 65) {
            return "Grade C";
        }
        else if (mark >= 35) {
            return "Pass";
        }
        else {
            return "Fail";
        }
    }
}
