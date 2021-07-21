package homeWork15;

import java.util.ArrayList;
import java.util.List;

public class AppAnimals {
    public static void main(String[] args) {
        Carnivores nancy = new Lion();

        nancy.name = "Persian Lion";
        nancy.suborderCarnivora = SuborderCarnivora.FELIFORMIA;
        nancy.killPrey();

        Carnivores jack = new Wolf();
        jack.name = "Steppe Wolf";
        jack.suborderCarnivora = SuborderCarnivora.CANIFORMIA;
        jack.move();

        BlueWhale frank = new BlueWhale();
        frank.setName("Blue Whale");
        frank.eat();
        frank.breath();
        frank.reproduce();
        frank.die();

        List<String> a = List.of("Ass","Cunt","Bitch","Cock","Fuck");
        for(String b:a) System.out.println(b);
    }
}
