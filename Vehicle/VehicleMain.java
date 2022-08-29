package Week2.Day8.Vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.engine();

        vehicle = new Truck();
        vehicle.engine();
    }
}

/*

Car has good engine!!

Truck has bad engine !


* */