package homework.homeWork10;

public class App1 {
    public static void main(String[] args) {
        Cat musya = new Cat("Musya",Gender.F,9,true);
        Dog shelby = new Dog("Shelby",Gender.F,3,Breed.AMERICAN_BULLY);
        musya.printInfo();
        shelby.printInfo();

        HomeAnimal fish = new HomeAnimal("Fish","Nemo",Gender.M,5);
        fish.printInfo();


        Peripherals[] myPeripherals = {Peripherals.MONITOR,Peripherals.KEYBOARD,Peripherals.MOUSE,Peripherals.SOUND_CARD,Peripherals.SPEAKERS};
        Computer myComp = new Computer(CPU.AMD,32,4000,VideoCard.AMD_RADEON,myPeripherals);
        System.out.println(myComp.toString());

        myComp.changeVideoCard(VideoCard.NVIDIA_GEFORCE);
        myComp.addStorageSpace(1000);
        System.out.println(myComp.toString());
    }
}
