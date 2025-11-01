class Vehicle {
    int speed = 0;

    void speedUp() {
        speed += 5;
        System.out.println("Vehicle speed increased to: " + speed + " km/h");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void speedUp() {
        speed += 20; // Car speeds up faster
        System.out.println("Car speed increased to: " + speed + " km/h");
    }
}

// Subclass Bicycle
class Bicycle extends Vehicle {
    @Override
    void speedUp() {
        speed += 10; // Bicycle speeds up slower
        System.out.println("Bicycle speed increased to: " + speed + " km/h");
    }
}

// Main class to test
public class Vehiclename {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Bicycle b = new Bicycle();

        v.speedUp();
        c.speedUp();
        b.speedUp();
    }
}
