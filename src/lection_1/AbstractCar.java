package lection_1;

import java.awt.*;

abstract class AbstractCar {
    public int Speed;
    public double Weight;
    public Color BodyColor;

    public AbstractCar(int speed, double weight, Color bodyColor) {
        Speed = speed;
        Weight = weight;
        BodyColor = bodyColor;
    }

    public abstract double Step();


}
