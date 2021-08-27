package homework.homeWork15;

public abstract class Whales implements Mammals {
    protected String name;
    protected SuborderWhale suborderWhale;
    abstract void swim();

    public Whales() {
    }

    public Whales(String name, SuborderWhale suborderWhale) {
        this.name = name;
        this.suborderWhale = suborderWhale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuborderWhale getSuborderWhale() {
        return suborderWhale;
    }

    public void setSuborderWhale(SuborderWhale suborderWhale) {
        this.suborderWhale = suborderWhale;
    }
}
