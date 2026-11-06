// Experiment 5 – Q1: Interface Animal Using Dog Class

import java.util.*;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class AnimalInterface {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.makeSound();

    }
}
