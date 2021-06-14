package computer;

public class Motherboard extends SystemBlock {
    protected Processor processor;
    protected Memory memory;

    public Motherboard() {
    }

    public Motherboard(String brand, String model, Processor processor, Memory memory) {
        super.brand = brand;
        super.model = model;
        this.processor = processor;
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
