package lection_1;

import java.awt.*;

public class EntityRacingCar extends EntityCar implements Raceable{
    /// <summary>
    /// Дополнительный цвет для спойлера
    /// </summary>
    private Color SpoilerColor;

    /// <summary>
    /// Признак (опция) наличия спойлера
    /// </summary>
    private boolean Spoiler;

    public EntityRacingCar(int speed, double weight, Color bodyColor, Color spoilerColor, boolean spoiler) {
        super(speed, weight, bodyColor);
        SpoilerColor = spoilerColor;
        Spoiler = spoiler;
    }


    @Override
    public double Step() {
        return getSpeed() * 100 / getWeight() * 1.1;
    }

    @Override
    public void startRace() {
        System.out.println("Гоночный автомобиль начинает гонку!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Гонка в процессе... " + (i + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Гонка завершена!");
    }
}
