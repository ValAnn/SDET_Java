package lection_1;

import java.awt.*;

public class EntityDumpTruck extends AbstractCar{
    /// <summary>
    /// Дополнительный цвет (для опциональных элементов)
    /// </summary>
    private Color AdditionalColor;

    /// <summary>
    /// Признак (опция) наличия кузова
    /// </summary>
    private boolean BodyKit ;

    /// <summary>
    /// Признак (опция) наличия tent
    /// </summary>
    private boolean Tent ;


    public EntityDumpTruck(int speed, double weight, Color bodyColor, Color additionalColor, boolean bodyKit, boolean tent) {
        super(speed, weight, bodyColor);
        AdditionalColor = additionalColor;
        BodyKit = bodyKit;
        Tent = tent;
    }

    @Override
    public double Step() {
        return (double) Speed * 100 / Weight * 0.9;
    }
}
