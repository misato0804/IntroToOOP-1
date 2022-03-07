package interfaces;

public class Caravan implements Movable, Habitable {
    private int maxCapacity;
    /* distance from 0 (home) to current location */
    private int location;

    public Caravan(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.location = 0;
    }

    @Override
    public boolean canFit(int inhabitants) {
        return inhabitants <= maxCapacity;
    }

    @Override
    public void move(int distance) {
        location += distance;
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
