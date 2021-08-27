package homework.computer;

public class VideoCard extends SystemBlock {
    private int memoryGb;
    private double frequencyMHz;

    public VideoCard() {
    }

    public VideoCard(String brand, String model, int memoryGb, double frequencyMHz) {
        super.brand = brand;
        super.model = model;
        this.memoryGb = memoryGb;
        this.frequencyMHz = frequencyMHz;
    }

    public int getMemoryGb() {
        return memoryGb;
    }

    public void setMemoryGb(int memoryGb) {
        this.memoryGb = memoryGb;
    }

    public double getFrequencyMHz() {
        return frequencyMHz;
    }

    public void setFrequencyMHz(short frequencyMHz) {
        this.frequencyMHz = frequencyMHz;
    }
}
