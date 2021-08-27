package lessons.Lesson8;

public class App3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Ford";
        myCar.model = "F-150";
        myCar.colour = "Silver";
        myCar.year = 2004;

        myCar.startEngine();

        Car bb = new Car();
        bb.year = 2001;
        bb.brand = "Nissan";
        bb.model = "Presea";

        bb.startEngine();
        bb.stopCar();

        Car xx = new Car();
        xx.brand = "Honda";
        xx.stopCar();
    }
}
