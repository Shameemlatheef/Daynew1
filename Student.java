package com.Day3;

public class Student {
    int roll;
    String name;
    int marks;
    public void DisplayStudentdetails(){
        System.out.println(roll);
        System.out.println(name);
        System.out.println(marks);;
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.roll=5;
        s.name="shameem";
        s.marks=50;
        Student c=new Student();
        c.roll=6;
        c.name="micheal";
        c.marks=60;
        c.DisplayStudentdetails();
        s.DisplayStudentdetails();
    }
}
