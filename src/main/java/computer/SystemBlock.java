package computer;

public class SystemBlock extends Computer {
    protected Motherboard motherboard;
    protected Disk disk;
    protected VideoCard videoCard;

    public SystemBlock() {
    }

    public SystemBlock(String brand, String model, Motherboard motherboard, Disk disk, VideoCard videoCard) {
        super.brand = brand;
        super.model = model;
        this.motherboard = motherboard;
        this.disk = disk;
        this.videoCard = videoCard;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
}
