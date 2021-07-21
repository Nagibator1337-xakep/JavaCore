package homeWork15;

public class Lion extends Carnivores {
    @Override
    public void move() {
        System.out.println("I'm a "+super.name+", RAWR! Trot-trot...");
    }

    @Override
    void killPrey() {
        System.out.println("I'm a "+super.name+", RAWR! Killing you with my paw, boop!");
    }

    @Override
    public void breath() {
        System.out.println("[Breathing in Lion]");
    }

    @Override
    public void eat() {
        System.out.println("RAWR "+super.name+" eating you");
    }

    @Override
    public void reproduce() {
        System.out.println("Fuck the "+super.name+" lioness");
    }

    @Override
    public void die() {
        System.out.println("RAWR "+super.name+" dead...");
    }

    @Override
    public void produceMilk() {
        System.out.println("RAWR "+super.name+", Milking cubs");
    }

    @Override
    public void squirm() {
        System.out.println("RAWR "+super.name+" just chillin...");
    }
}
