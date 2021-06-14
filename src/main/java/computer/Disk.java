package computer;

public class Disk extends SystemBlock {
    private int storageGB;

    public Disk() {
    }

    public Disk(String brand, String model, int storageGB) {
        super.brand = brand;
        super.model = model;
        this.storageGB = storageGB;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }
}
