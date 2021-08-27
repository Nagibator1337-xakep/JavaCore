package homework.computer;

public class Memory extends Motherboard {
    private int volumeGB;
    private int mbps;

    public Memory() {
    }

    public Memory(String brand, String model, int volumeGB, int mbps) {
        super.brand = brand;
        super.model = model;
        this.volumeGB = volumeGB;
        this.mbps = mbps;
    }

    public int getVolumeGB() {
        return volumeGB;
    }

    public void setVolumeGB(int volumeGB) {
        this.volumeGB = volumeGB;
    }

    public int getMbps() {
        return mbps;
    }

    public void setMbps(int mbps) {
        this.mbps = mbps;
    }
}
