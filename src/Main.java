public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();

        myCar.start();
        myBike.start();

        myCar.displayInfo();
        System.out.println("This car is red.");

        myBike.displayInfo();
        System.out.println("This bike is blue.");

        testVehicleStart(myCar);
        testVehicleStart(myBike);
    }
    public static void testVehicleStart(Vehicle vehicle) {
        vehicle.start();
    }
}