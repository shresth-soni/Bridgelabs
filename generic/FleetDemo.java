public // Fleet11.java
import java.util.ArrayList;
import java.util.List;

class Vehicle { String id; Vehicle(String id){this.id=id;} public String toString(){return id;} }
class Truck extends Vehicle { Truck(String id){super(id);} }
class Bike extends Vehicle { Bike(String id){super(id);} }

class FleetManager<T extends Vehicle> {
    private final List<T> fleet = new ArrayList<>();
    public void addVehicle(T v){ fleet.add(v); }
    public void showFleet(){ fleet.forEach(System.out::println); }
}

public class FleetDemo {
    public static void main(String[] args) {
        FleetManager<Truck> tm = new FleetManager<>();
        tm.addVehicle(new Truck("Truck-01"));
        tm.showFleet();

        FleetManager<Bike> bm = new FleetManager<>();
        bm.addVehicle(new Bike("Bike-A1"));
        bm.showFleet();
    }
}
 {
    
}
