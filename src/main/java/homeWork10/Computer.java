package homeWork10;

import java.util.Arrays;

public class Computer {
    private CPU cpu;
    private int ramGB;
    private int storageGB;
    private VideoCard videoCard;
    private Peripherals[] peripherals;

    public Computer() {}
    public Computer(CPU cpu, int ramGB, int storageGB, VideoCard videoCard,Peripherals[] peripherals) {
        this.cpu = cpu;
        if(ramGB<0) throw new IllegalArgumentException("RAM can't be negative");
        this.ramGB = ramGB;
        if(storageGB<0) throw new IllegalArgumentException("Storage can't be negative");
        this.storageGB = storageGB;
        this.videoCard = videoCard;
        this.peripherals = peripherals;
    }

    public String toString() {
        return "Your Computer: \n" +
                "CPU - " + cpu +
                "\nRAM - " + ramGB +
                "\nStorage - " + storageGB + " GB" +
                "\nVideo Card - " + videoCard +
                "\nPeripherals - " + Arrays.toString(peripherals) +
                "\n-------------------------------";
    }

    public CPU getCpu() {
        return cpu;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ramGB;
    }
    public void setRam(int ramGB) {
        if(ramGB<0) throw new IllegalArgumentException("RAM can't be negative");
        this.ramGB = ramGB;
    }

    public int getStorageGB() {
        return storageGB;
    }
    public void setStorageGB(int storageGB) {
        if(storageGB<0) throw new IllegalArgumentException("Storage can't be negative");
        this.storageGB = storageGB;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }
    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void changeVideoCard(VideoCard videoCard) {
        if (this.videoCard == videoCard) System.out.println("Video card not modified");
        else {
        System.out.println("Video card changed to "+videoCard);
        this.videoCard=videoCard; }
    }

    public void addStorageSpace(int gb) {
        if(storageGB<0) throw new IllegalArgumentException("Storage added can't be negative");
        this.storageGB = this.storageGB+gb;
        System.out.println("Storage space increased by "+gb+" GB, now it is "+this.storageGB+" GB");
    }
}