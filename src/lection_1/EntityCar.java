package lection_1;

import java.awt.*;

public class EntityCar extends AbstractCar implements Refuelable {
    /// <summary>
    /// Скорость
    /// </summary>
    private int Speed ;
    /// <summary>
    /// Вес
    /// </summary>
    private double Weight;
    /// <summary>
    /// Основной цвет
    /// </summary>
    private Color BodyColor;
    /// <summary>
    /// Шаг перемещения автомобиля
    /// </summary>

    public int getSpeed(){
        return Speed;
    }
    public double getWeight(){
        return Weight;
    }
    public double Step() {return (double)Speed * 100 / Weight;};

    @Override
    public void refuel(double liters) {
        System.out.println("Заправлено " + liters + " литров.");
    }
    /// <summary>
    /// Конструктор с параметрами
    /// </summary>
    /// <param name="speed">Скорость</param>
    /// <param name="weight">Вес автомобиля</param>
    /// <param name="bodyColor">Основной цвет</param>
    public EntityCar(int speed, double weight, Color bodyColor) {
        super(speed, weight, bodyColor);
    }
    public static void displayInfo() {
        System.out.println("Информация о автомобиле");
    }
}
