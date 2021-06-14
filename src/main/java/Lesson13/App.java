package Lesson13;

public class App {
    public static void main(String[] args) {
//        String str = "Hi";
//        System.out.println(str.length());

        DesktopLight xx = new DesktopLight();
        LaserPrinter printer = new LaserPrinter();

        AmericanPowerPlug device = new DesktopLight();
        AmericanPowerPlug dev2 = new LaserPrinter();

        AmericanPowerPlug[] devices = {xx,printer,device,dev2};
        for (AmericanPowerPlug d: devices) d.americanPowerPlug();



    }
}
