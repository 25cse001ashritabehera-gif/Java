// Experiment 4 – Q2: Person and Employee Class Using Inheritance

import java.util.*;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    double annualSalary;
    int year;
    String insuranceNumber;

    Employee(String name, double annualSalary, int year, String insuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }

    double getAnnualSalary() {
        return annualSalary;
    }

    void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    String getInsuranceNumber() {
        return insuranceNumber;
    }

    void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
}

public class TestEmployee {
    public static void main(String[] args) {

        Employee e = new Employee("Rahul", 500000, 2022, "NI12345");

        System.out.println("Employee Details");
        System.out.println("Name: " + e.getName());
        System.out.println("Annual Salary: " + e.getAnnualSalary());
        System.out.println("Joining Year: " + e.getYear());
        System.out.println("National Insurance Number: " + e.getInsuranceNumber());
    }
}
