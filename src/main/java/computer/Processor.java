package computer;

public class Processor extends Motherboard {
    private double frequencyGHz;
    private int cores;

    public Processor() {
    }

    public Processor(String brand, String model, double frequencyGHz, int cores) {
        super.brand = brand;
        super.model = model;
        this.frequencyGHz = frequencyGHz;
        this.cores = cores;
    }

    public double getFrequencyGHz() {
        return frequencyGHz;
    }

    public void setFrequencyGHz(double frequencyGHz) {
        this.frequencyGHz = frequencyGHz;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
