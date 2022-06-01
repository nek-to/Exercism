import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
//        throw new UnsupportedOperationException("Please implement the (static) TestTrack.race() method");
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
//        throw new UnsupportedOperationException("Please implement the (static) TestTrack.getRankedCars() method");
        List<ProductionRemoteControlCar> rankedCards = new ArrayList<>();
        if (prc1.getNumberOfVictories() < prc2.getNumberOfVictories()) {
            rankedCards.add(prc1);
            rankedCards.add(prc2);
        }else {
            rankedCards.add(prc2);
            rankedCards.add(prc1);
        }
        return rankedCards;
    }
}
