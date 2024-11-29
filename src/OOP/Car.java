package OOP;

public class Car extends Vehicle{
    private int numOfDoors;

    public Car(String brand, int speed, int numOfDoors) {
        super(brand, speed);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() { return numOfDoors; }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public void displayCarDetails() {
        System.out.println("Brand: " + getBrand() + ", Speed: " + getSpeed() + ", Doors: " + numOfDoors);
    }

    @Override
    public String toString() {
        return "Car [Brand=" + getBrand() + ", Speed=" + getSpeed() + ", Doors=" + numOfDoors + "]";
    }

}


