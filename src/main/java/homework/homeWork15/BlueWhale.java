package homework.homeWork15;

public class BlueWhale extends Carnivores {
    @Override
    public void move() {
        System.out.println("BLOB "+super.name+" is swimming...");
    }

    @Override
    void killPrey() {
        System.out.println("BLOB you're fucked by "+super.name+"!");
    }

    @Override
    public void breath() {
        System.out.println("BLOB "+super.name+" fountain goes PSSSSST!");
    }

    @Override
    public void eat() {
        System.out.println("BLOB "+super.name+" eating plankton");
    }

    @Override
    public void reproduce() {
        System.out.println("BLOB fucking "+super.name+" she-whale");
    }

    @Override
    public void die() {
        System.out.println("BLOB "+super.name+" dead...");
    }

    @Override
    public void produceMilk() {
        System.out.println("Milking little "+super.name+" whales");
    }

    @Override
    public void squirm() {
        System.out.println("BLOB BLOB "+super.name+" just chillin...");
    }
}
