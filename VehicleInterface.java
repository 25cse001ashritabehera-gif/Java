// Experiment 5 – Q6: Interface Vehicle Using Car and Bike Classes

import java.util.*;

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class VehicleInterface {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}
