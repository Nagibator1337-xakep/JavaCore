package computer;

public class App {
    public static void main(String[] args) {

        Processor myCPU = new Processor("AMD","Ryzen 9 5950X", 4.9, 16);
        Memory myMemory = new Memory("Patriot","Viper Steel",32,25600);
        Motherboard myMotherboard = new Motherboard("Gigabyte","X570 AORUS MASTER",myCPU,myMemory);
        VideoCard myVideoCard = new VideoCard("GeForce","RTX 3090",24,1860);
        Disk myHDD = new Disk("Intel","Optane 905P",1500);
        SystemBlock mySystemBlock = new SystemBlock("Thermaltake","A500 TG",myMotherboard,myHDD,myVideoCard);
        Keyboard myKeyboard = new Keyboard("Razer","Huntsman V2 Analog");
        Mouse myMouse = new Mouse("Razer","Basilisk Ultimate");
        Monitor myMonitor = new Monitor("ASUS","MX38VC",37.5);
        Computer myComp = new Computer(mySystemBlock,myMonitor,myKeyboard,myMouse);

        System.out.println(myComp.getSystemBlock().getMotherboard().getProcessor().getBrand());
        System.out.println(myComp.getBrand());


    }
}
