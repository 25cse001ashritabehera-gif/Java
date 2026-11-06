// Experiment 5 – Q3: Interface Greeting with Abstract and Default Methods

import java.util.*;

interface Greeting {
    void sayHello();

    default void sayBye() {
        System.out.println("Goodbye!");
    }
}

class Welcome implements Greeting {
    public void sayHello() {
        System.out.println("Hello! Welcome to Java.");
    }
}

public class GreetingInterface {
    public static void main(String[] args) {

        Welcome w = new Welcome();

        w.sayHello();
        w.sayBye();
    }
}
