package homework.homeWork15;

public class Wolf extends Carnivores {
    @Override
    public void move() {
        System.out.println("I'm a "+super.name+"! Look at my giant paws! Trot-trot...");
    }

    @Override
    void killPrey() {
        System.out.println("Woooo! "+super.name+" is killing you!");
    }

    @Override
    public void breath() {
        System.out.println("[Breathing in Wolf]");
    }

    @Override
    public void eat() {
        System.out.println("Woooo "+super.name+" is eating you");
    }

    @Override
    public void reproduce() {
        System.out.println("Fuck the bitch!");
    }

    @Override
    public void die() {
        System.out.println("Wooo... "+super.name+" dead...");
    }

    @Override
    public void produceMilk() {
        System.out.println("RAWR, Milking "+super.name+" puppies");
    }

    @Override
    public void squirm() {
        System.out.println("Wooo "+super.name+" just chillin...");
    }
}
