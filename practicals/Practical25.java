class Vehicle {
    protected String vehicleNumber, brand, fuelType;

    Vehicle(String n, String b, String f) {
        vehicleNumber = n;
        brand = b;
        fuelType = f;
    }

    void displayDetails() {
        System.out.println(vehicleNumber + " " + brand + " " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    boolean ACavailable;

    Car(String n, String b, String f, int s, boolean ac) {
        super(n, b, f);
        numberOfSeats = s;
        ACavailable = ac;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats + ", AC: " + ACavailable);
    }
}

class ElectricCar extends Car {
    double batteryCapacity, chargingTime;

    ElectricCar(String n, String b, int s, boolean ac, double cap, double time) {
        super(n, b, "Electric", s, ac);
        batteryCapacity = cap;
        chargingTime = time;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery: " + batteryCapacity + " kWh, charge: " + chargingTime + " h");
    }
}

public class Practical25 {
    public static void main(String[] a) {
        Vehicle v = new Vehicle("V1", "Honda", "Petrol");
        Vehicle up = new Car("C1", "Hyundai", "Petrol", 5, true);
        Vehicle e = new ElectricCar("E1", "Tata", 5, true, 40, 6);
        v.displayDetails();
        up.displayDetails();
        e.displayDetails();
        if (up instanceof Car)
            System.out.println("Upcast car seats: " + ((Car) up).numberOfSeats);
    }
}
