package interfaces;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car("Tesla");
        House house = new House(3);
        Caravan caravan = new Caravan(10);

        Movable[] movables = {car, caravan};
        Habitable[] habitables = {house, caravan};

        // down-casting
        ((Caravan) movables[1]).canFit(5);

        // runtime error ClassCastException
        // ((Caravan) habitables[0]).canMove();
    }
}
