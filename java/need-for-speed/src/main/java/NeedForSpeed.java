class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    int speed;
    int batteryDrained;
    int fullBattery;
    int fullDistance;

    public NeedForSpeed(int speed, int batteryDrained) {
        this.speed = speed;
        this.batteryDrained = batteryDrained;
        fullBattery = 100;
        fullDistance = 0;
    }

    public boolean batteryDrained() {
//        throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
        return fullBattery < batteryDrained;
    }

    public int distanceDriven() {
//        throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
        return fullDistance;
    }

    public void drive() {
//        throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
        if (!batteryDrained()) {
            fullBattery -= batteryDrained;
            fullDistance += speed;
        }
    }

    public static NeedForSpeed nitro() {
//        throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
//        throw new UnsupportedOperationException("Please implement the RaceTrack.carCanFinish() method");
        while (!car.batteryDrained()) {
            car.drive();
        }
        if (car.distanceDriven() >= this.distance) return true;

        return false;
    }
}
