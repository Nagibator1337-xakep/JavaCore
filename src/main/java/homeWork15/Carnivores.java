package homeWork15;

public abstract class Carnivores implements Mammals {
    protected String name;
    protected SuborderCarnivora suborderCarnivora;
    abstract void killPrey();

    public Carnivores() {
    }

    public Carnivores(String name, SuborderCarnivora suborderCarnivora) {
        this.name = name;
        this.suborderCarnivora = suborderCarnivora;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuborderCarnivora getSuborder() {
        return suborderCarnivora;
    }

    public void setSuborder(SuborderCarnivora suborderCarnivora) {
        this.suborderCarnivora = suborderCarnivora;
    }
}