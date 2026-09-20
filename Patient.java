//#EXPERIMENT - 3 (CLASS, OBJECT, STATIC METHOD, CONSTRUCTOR)
//#Q3. Design a class that can be used by a health care professional to keep track of a patient's vital statistics.
//The following are the details:
//Name of the class - Patient
//Member variables - Patient Name(String), height(double), width(double)
//Member function - double computeBMI()
//The above method should compute the BMI and return the result.
//The formula for computation of BMI is weight(in kilograms)/height * height(in metres)
//Create an object of Patient class and check the result.

import java.util.Scanner;
class Patient
  {
    private String name;
    private double height;
    private double weight;
    public Patient(String name, double height, double weight)
    {
      this.name=name;
      this.height=height;
      this.weight=weight;
    }
    public void displayInfo()
    {
      System.out.println("Patient Name:" +" "+ name);
      System.out.println("Height" +" "+ height);
      System.out.println("Weight" +" "+ weight);
      System.out.println("BMI" +" "+ computeBMI);
    }
  }
public class main
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Patient Name:");
      String name=sc.nextLine();
      System.out.println("Enter Height (in meters):");
      double height=sc.nextDouble();
      System.out.println("Enter Weight (in kilograms):");
      double weight=sc.nextDouble();
      Patient p1=new Patient(name, height, weight);
      p1,displayInfo();
      sc.close;
    }
  }
