package Lesson13;

public class DesktopLight implements AmericanPowerPlug, E27Bulb {
    private String colour;
    private int price;

    @Override
    public void americanPowerPlug() {
        System.out.println("Plug is implemented");
    }

    @Override
    public void useE27Bulb() {
        System.out.println("E27 bulb");
    }
}