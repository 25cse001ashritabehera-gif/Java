// Experiment 7 – Q2: Demonstrate Different Access Specifiers in Java
// 3. Access outside the package

import mypack.AccessDemo;

public class TestAccess {
    public static void main(String[] args) {

        AccessDemo obj = new AccessDemo();

        System.out.println("Public: " + obj.a);

    }
}
