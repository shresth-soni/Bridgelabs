interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
        location = "Station";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
        location = "Garage";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("CAR123", "Rohit", 20),
            new Bike("BIKE456", "Karan", 10)
        };

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            double fare = v.calculateFare(15);
            System.out.println("Fare for 15 km: " + fare);
            ((GPS)v).updateLocation("Customer Location");
            System.out.println("Current Location: " + ((GPS)v).getCurrentLocation());
            System.out.println("-----------------------");
        }
    }
}
