package homework.homeWork15;

public abstract class Primates implements Mammals {
    protected String name;
    protected SuborderPrimate suborderPrimate;
    abstract void monke();

    public Primates() {
    }

    public Primates(String name, SuborderPrimate suborderPrimate) {
        this.name = name;
        this.suborderPrimate = suborderPrimate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuborderPrimate getSuborderPrimate() {
        return suborderPrimate;
    }

    public void setSuborderPrimate(SuborderPrimate suborderPrimate) {
        this.suborderPrimate = suborderPrimate;
    }
}
