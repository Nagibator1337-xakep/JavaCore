package homeWork8;

public class HW8 {
    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle();
        myBicycle.brand = "Stark";
        myBicycle.model = "Temper";
        myBicycle.gearsBack = 7;
        myBicycle.gearsFront = 3;
        myBicycle.size = "M";
        myBicycle.type = "MTB";

        Bicycle oldBicycle = new Bicycle();
        oldBicycle.brand = "Ural";
        oldBicycle.type = "Fixed Road";

        myBicycle.gearsUpFront(2);

        oldBicycle.getTotalGears();
        oldBicycle.setBackGear(1);
        oldBicycle.setFrontGear(1);

        myBicycle.getTotalGears();
        myBicycle.gearUpBack();
        myBicycle.gearUpBack();
        myBicycle.gearUpBack();
        myBicycle.gearUpBack();
        myBicycle.getCurrentGearFront();
        myBicycle.getCurrentGearBack();
        myBicycle.gearsUpBack(2);
        myBicycle.gearUpBack();
        myBicycle.gearsUpBack(1);

    }
}
