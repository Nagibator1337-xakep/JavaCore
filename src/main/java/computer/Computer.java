package computer;

public class Computer {
    protected String brand;
    protected String model;
    protected Keyboard keyboard;
    protected Mouse mouse;
    protected Monitor monitor;
    protected SystemBlock systemBlock;

    public Computer() {
    }

    public Computer(SystemBlock systemBlock, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.systemBlock = systemBlock;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }
}
