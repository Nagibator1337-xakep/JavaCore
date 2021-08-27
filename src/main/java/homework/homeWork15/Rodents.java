package homework.homeWork15;

public abstract class Rodents implements Mammals {
    protected String name;
    protected SuborderRodent suborderRodent;
    abstract void peep();

    public Rodents() {
    }

    public Rodents(String name, SuborderRodent suborderRodent) {
        this.name = name;
        this.suborderRodent = suborderRodent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuborderRodent getSuborderRodent() {
        return suborderRodent;
    }

    public void setSuborderRodent(SuborderRodent suborderRodent) {
        this.suborderRodent = suborderRodent;
    }
}
