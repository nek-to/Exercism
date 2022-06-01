import java.util.List;

class ProductionRemoteControlCar implements RemoteControlCar {
    private final int SPEED = 10;
    private int distanceTraveled;
    private int numberOfVictories;

    @Override
    public void drive() {
        distanceTraveled += SPEED;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceTraveled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar that) {
        if (this.numberOfVictories > that.numberOfVictories) return 1;
        return 0;
    }
}
