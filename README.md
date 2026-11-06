# Experiment-1(I/O in Java)
Q 1. Write a Program that accepts two Strings as command line arguments and generate the output in the required format 
Q 2. Write a Java program to find if the given number is prime or not.
Q 3. Write a program to print the sum of all the digits of a given number.
Q 4. Write a Java program to find if the given number is palindrome or not
Q 5. Write a program to print first 5 values which are divisible by 2, 3, and 5.

# Experiment 2: (Array)
Q 1. Write a program to initialize an integer array and find the maximum and minimum value of the array.
Q 2. Write a program to initialize an integer array with values and check if a given number is present in the array or not.
Q 3. Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
Q 4. Write a program to remove the duplicate elements in an array and print the same.
Q 5. Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

# Experiment 3:( Class, Object, Static method, Constructor)
Q 1 Create a class Box that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.
Q 2. Create a new class called Calculator with the following methods:
     1. A static method called powerInt(int num1,int num2)
        This method should return num1 to the power num2.
     2. A static method called powerDouble(double num1,int num2).
        This method should return num1 to the power num2.
     3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.
Q 3. Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables -
patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.
Q 4. Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables 
Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables
In the main method, create a book object and print all details of the book (including the author details)

# Experiment 4: (Inheritance and polymorphism)
Q 1. Create a class named ‘Animal’ which includes methods like eat() and sleep(). Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly(). Create an instance of Animal class and invoke the eat and sleep methods using this object. Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
Q 2. Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee that will inherit the Person class.T he other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java
Your class should have the necessary constructors and getter/setter methods. Write another class called TestEmployee, containing a main method to fully test your class definition.
Q 3. Create a school application with a class called Person. Create name and dateOfBirth as member variables.
Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary, and the subject that the teacher teaches.
Create a class called Student that inherits from Person class. This class will have a member variable called studentId.
Create a class called College Student that inherits from Student class. This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.
Create objects of each of this classes, invoke and test the methods that are available in these classes.
Q 4. Create a base class Fruit with name ,taste and size as its attributes.
Create a method called eat() which describes the name of the fruit and its taste.
Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
Q 5. Write a program to create a class named shape. It should contain 2 methods, draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively.
For this class, create three sub classes, Circle, Triangle and Square and each class should override the parent class functions - draw () and erase ().
The draw() method should print “Drawing Circle”, “Drawing Triangle” and “Drawing Square” respectively.
The erase() method should print “Erasing Circle”, “Erasing Triangle” and “Erasing Square” respectively.
Create objects of Circle, Triangle and Square in the following way and observe the polymorphic nature of the class by calling draw() and erase() method using each object.
Shape c=new Circle();
Shape t=new Triangle();
Shape s=new Square();

# Experiment 5: (Interface and Wrapper Class)
Q 1. Write a program to create an interface Animal with a method makeSound(). Implement it in a class Dog and display appropriate output.
Q 2.  Write a program to create an interface Shape with a method draw (). Implement it in two classes: Circle and Rectangle. Call both using interface reference.
Q 3   Write a program to create an interface Greeting with: One abstract method sayHello(), One default method sayBye(). Implement and demonstrate both methods.
Q 4. Write a java program to create an interface NumberPrinter with method printNumber(Integer num). Implement and display the number.
Q 5. Write a java program to create two interfaces: 
                                                                  Printer → print() 
                                                                  Scanner → scan()
Implement both in a single class and demonstrate functionality.
Q 6. Write a program using an interface Vehicle with method start (). Implement it in classes Car and Bike.

# Experiment 6: (String and StringBuffer)
Q 1. Write a Program to check whether a given String is Palindrome or not.
Q 2. Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
Q 3 Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
Q 4. Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.
Q 5. Write a java program that accepts a string and returns a new string without the first and last character of the input string.
Q 6. Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

# Experiment 7: (Package and Exception Handling)
Q 1. Write a program to create a package and include a class inside it. Demonstrate how to compile and run the package program.
Q 2. Write a program to demonstrate the use of different access specifiers (public, protected, default, private) within and outside a package.
Q 3 Write a program to create a user-defined package for mathematical operations and use it in another class.
Q 4. Write a program that handles multiple exceptions such as ArrayIndexOutOfBoundsException and ArithmeticException.
Q 5. Write a program to demonstrate the use of a finally block that executes regardless of exception occurrence.
Q 6.  Write a program to create and use a user-defined exception (e.g. insufficient balance). 

# Experiment 8: (Multithreading and Inner class)
Q 1. Write a program to create a thread using the Runnable interface that prints a message continuously for a few iterations.
Q 2. Write a program to create two threads: One prints even numbers, One prints odd numbers. Execute both simultaneously.
Q 3 Write a program to create a user-defined package for mathematical operations and use it in another class.
Q 4. Write a program that handles multiple exceptions such as ArrayIndexOutOfBoundsException and ArithmeticException.
Q 5. Write a program to demonstrate the use of a finally block that executes regardless of exception occurrence.
Q 6.  Write a program to create and use a user-defined exception (e.g. insufficient balance). 

# Experiment 9: (File Handling)
Q 1. Write a Java program to count the number of characters in a file.
Q 2. Write a program to copy contents from one file to another file.
Q 3 Write a program to replace all occurrences of a particular word in a file with another word.
Q 4. Write a Java program to display only those lines from a file that contain a given keyword.
Q 5. Write a program to read a file and display its contents in reverse order (line by line).
Q 6.  Write a program to count the frequency of each word in a file.

# Experiment 10: (AWT and Event Handling)
Q 1. Create a program with two buttons: “Show” and “Exit”. Handle their actions using event handling.
Q 2. Write a Java AWT program to add two numbers entered in text fields when a button is clicked.
Q 3 Create a program to count how many times a button is clicked and display the count.
Q 4.  Create a program that changes the text in a label when a key is pressed using KeyListener interface in Java.
Q 5.  Write a Java AWT program where selecting different options from checkboxes displays selected items when a button is clicked.
Q 6.   Develop a Java AWT login form and validate username and password on button click.

# Experiment 11: (SWING and Event Handling)
Q 1. Write a Java Swing program to create a window using JFrame class in Swing and display a button. Show a message when the button is clicked using ActionListener interface in Java.
Q 2. Write a program to properly close a window using WindowAdapter class in Java.
Q 3 Write a Swing program to display mouse click coordinates using MouseListener interface in Java.
Q 4. Write a Swing program where selecting multiple options using checkboxes displays selected items when a button is clicked.
Q 5.  Create a Swing application to change font style and size of text using buttons or menu items.
Q 6.   Create a simple calculator using Swing components and handle operations through button events.
