public class ElonsToyCar {
    int driven = 0;
    int battery = 100;
    public static ElonsToyCar buy() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
        if (driven == 0) {
            return "Driven 0 meters";
        } else if (driven > 2000) {
            return "Driven 2000 meters";
        }
        return "Driven " + driven + " meters";
    }

    public String batteryDisplay() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
        int newBatState = 0;
        int counter = driven / 20;
        newBatState = battery - counter;
        if (newBatState == 100) {
            return "Battery at 100%";
        } else if (newBatState <= 0) {
            return "Battery empty";
        }
        return "Battery at " + newBatState + "%";
    }

    public void drive() {
//        throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
        driven = driven + 20;
    }
}
