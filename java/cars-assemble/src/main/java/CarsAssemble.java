public class CarsAssemble {

    public double productionRatePerHour(int speed) {
//        throw new UnsupportedOperationException("Please implement the AssemblyLine.productionRateperHour() method");
        double result = (221 * speed);
        if (speed > 0 && speed < 5) {
            return result;
        } else if (speed > 4 && speed < 9) {
            return result * 0.9;
        } else if (speed == 9) {
            return result * 0.8;
        } else return result * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
//        throw new UnsupportedOperationException("Please implement the AssemblyLine.workingItemsPerMinute() method");
        int result = (221 * speed);
        if (speed > 0 && speed < 5) {
            return result / 60;
        } else if (speed > 4 && speed < 9) {
            return (int) (result * 0.9) / 60;
        } else if (speed == 9) {
            return (int) (result * 0.8) / 60;
        } else return (int) (result * 0.77) / 60;
    }
}
