//##EXPERIMENT - 3 (CLASS, OBJECT, STATIC METHOD, CONSTRUCTOR)
//#Q1. Create aa class box that uses a parameterized constructor to initialize the dimensions of a box.
//The dimensions of the box are width, height, and depth. The class should have a method that can return the volume of the box. 
//Create an object of the box class and test the functionalities.

import java.util.*;
class box
  {
    double l, b, h;
    box()
    {
      l=0.0;
      b=0.0;
      h=0.0;
    }
    box(double l, double b, double h)
    {
       this.l=l;
       this.b=b;
       this.h=h;
    }
    public double cal()
    {
       return l*b*h;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        box b=new box();
        System.out.println("Enter l, b, h:");
        double l1=sc.nextDouble();
        double b1=sc.nextDouble();
        double h1=sc.nextDouble();
        box ob1=new box(l1, b1, h1);
        System.out.println("Length is" + l1);
        System.out.println("Breadth is" + b1);
        System.out.println("Height is" + h1);
        System.out.println("Volume is" + ob1.cal());
    }
}
