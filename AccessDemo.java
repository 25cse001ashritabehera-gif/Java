// Experiment 7 – Q2: Demonstrate Different Access Specifiers in Java
// 1. Create a package class

package mypack;

public class AccessDemo {

    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    public void display() {
        System.out.println("Public: " + a);
        System.out.println("Protected: " + b);
        System.out.println("Default: " + c);
        System.out.println("Private: " + d);
    }
}
