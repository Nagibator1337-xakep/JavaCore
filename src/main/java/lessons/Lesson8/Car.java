package lessons.Lesson8;

public class Car {
    public String brand;
    public String model;
    public String colour;
    public int year;

    public void startEngine() {
        System.out.println("Engine of " + brand + " " + model + " is started");
    }

    public void stopCar() {
        System.out.println(brand + " " + model + " is stopped");
    }
}