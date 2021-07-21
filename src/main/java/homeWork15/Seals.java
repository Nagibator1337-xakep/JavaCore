package homeWork15;

public abstract class Seals implements Mammals {
    protected String name;
    protected SuborderSeal suborderSeal;
    abstract void clapFlippers();

    public Seals() {
    }

    public Seals(String name, SuborderSeal suborderSeal) {
        this.name = name;
        this.suborderSeal = suborderSeal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuborderSeal getSuborderSeal() {
        return suborderSeal;
    }

    public void setSuborderSeal(SuborderSeal suborderSeal) {
        this.suborderSeal = suborderSeal;
    }
}
