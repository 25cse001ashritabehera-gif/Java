//# EXPERIMENT - 3 (CLASS, OBJECT, STATIC METHOD, CONSTRUCTOR)
//#Q2. Create a new class called calculator with the following methods:
  // 1. A static method called powerInt(int num1, int num2)
   //   This method should return num1 to the power num2
  // 2. A static method called powerDouble(double num1, int num2)
   //   This method should return num1 to the power of num2
 //  3. Invoke both the methods and test the functionalities.
//HINT : Use Math.power(x, y)

import java.util.*;
class calc
  {
    static public int powInt(int x, int y)
    {
      return (int)Math.pow(x, y);
    }
    static public double powDouble(double x1, int y1)
    {
      return Math.pow(x1, y1);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter for x and y to x^ y:");
      int x, y;
      x=sc.nextInt();
      y=sc.nextInt();
      System.out.println("Power for x^y is" + calc.powInt(x, y));
      System.out.println("Enter for x1 and y1 to x1^y1:");
      double x1;
      int y1;
      x1=sc.nextDouble();
      y1=sc.nextInt();
      System.out.println("Power for x1^y1 is" + calc.powDouble(x1, y1));
    }
  }
