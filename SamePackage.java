// Experiment 7 – Q2: Demonstrate Different Access Specifiers in Java
// 2. Access within the same package

package mypack;

public class SamePackage {
    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        System.out.println("Public: " + obj.a);
        System.out.println("Protected: " + obj.b);
        System.out.println("Default: " + obj.c);

        // Private member cannot be accessed directly
        obj.display();
    }
}
