import lection_1.EntityCar;
import lection_1.EntityDumpTruck;
import lection_1.EntityRacingCar;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EntityCar car = new EntityCar(100, 20000, Color.BLACK);
        EntityDumpTruck dumpTruck = new EntityDumpTruck(100, 20000, Color.blue, Color.BLACK, true, true);
        EntityRacingCar racingCar = new EntityRacingCar(200, 2000, Color.GRAY, Color.DARK_GRAY, true);

        EntityCar.displayInfo();
        racingCar.startRace();
    }
}