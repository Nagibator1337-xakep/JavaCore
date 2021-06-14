package homeWork10;

public class Dog extends HomeAnimal {
    private Breed breed;
    private final int MAX_AGE = 34;

    public Dog() {}

    public Dog(String name,Gender gender,int age,Breed breed) {
        super(name,gender,age);
        if(age>34 || age<0) throw new IllegalArgumentException("Dog age is wrong, max age is 34 years");
        this.breed = breed;
    }

    public void printInfo() {
        System.out.println("Your Dog:");
        super.printInfo();
        System.out.printf("Breed - %s;\n" +
                "-------------------------------\r\n",
                this.breed);
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
    public Breed getBreed() {
        return breed;
    }
}