package OOP;

public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Brand", 100);
        Car car = new Car("Toyota", 150, 4);

        System.out.println(vehicle.toString()); // Calls Vehicle's toString()
        System.out.println(car.toString());     // Calls Car's overridden toString()
    }
}
