interface Vehicle {
    void start();

    // Default method introduced in Java 8
    default void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started with ignition key.");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started with self-start button.");
    }

    // Override default stop() if needed
    public void stop() {
        System.out.println("Bike stopped safely.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();   // uses default

        v2.start();
        v2.stop();   // overridden version
    }
}