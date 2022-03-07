package interfaces;

public class Car implements Movable {
    private String brand;
    private int fuelLevel;

    public Car(String brand) {
        this.brand = brand;
        this.fuelLevel = 100;
    }

    public Car(String brand, int fuelLevel) {
        this.brand = brand;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void move(int distance) {
        fuelLevel -= distance * 0.1;
    }

    // method overriding: inheritance -> subclass can override a method
    // method overloading: same method name, different set of parameters
    public void move(int distance, int time) {

    }

    @Override
    public boolean canMove() {
        return fuelLevel > 0;
    }
}
