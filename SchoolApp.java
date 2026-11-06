// Experiment 4 – Q3: School Application Using Inheritance

import java.util.*;

class Person {
    String name;
    String dateOfBirth;

    Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

class Teacher extends Person {
    double salary;
    String subject;

    Teacher(String name, String dob, double salary, String subject) {
        super(name, dob);
        this.salary = salary;
        this.subject = subject;
    }

    void display() {
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    int studentId;

    Student(String name, String dob, int studentId) {
        super(name, dob);
        this.studentId = studentId;
    }

    void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
    }
}

class CollegeStudent extends Student {
    String collegeName;
    String year;

    CollegeStudent(String name, String dob, int id,
                   String collegeName, String year) {
        super(name, dob, id);
        this.collegeName = collegeName;
        this.year = year;
    }

    void display() {
        super.display();
        System.out.println("College Name: " + collegeName);
        System.out.println("Year: " + year);
    }
}

public class SchoolApp {
    public static void main(String[] args) {

        Teacher t = new Teacher("Rahul", "12-05-1985",
                                50000, "Java");

        Student s = new Student("Amit", "10-08-2007", 101);

        CollegeStudent c = new CollegeStudent(
                "Priya", "15-06-2006", 102,
                "GIET University", "Second Year");

        System.out.println("Teacher Details:");
        t.display();

        System.out.println("\nStudent Details:");
        s.display();

        System.out.println("\nCollege Student Details:");
        c.display();
    }
}
