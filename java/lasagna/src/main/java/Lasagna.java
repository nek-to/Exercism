public class Lasagna {
    int timeLasagna = 40;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return timeLasagna;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minInOven) {
        return timeLasagna - minInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int minInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minInOven;
    }
}
