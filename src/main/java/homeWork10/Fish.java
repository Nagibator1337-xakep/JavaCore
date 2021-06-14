package homeWork10;

public class Fish extends HomeAnimal {
    public Fish() {}
    public Fish(String name,Gender gender,int age) {
        super(name,gender,age);
        if(age>20 || age<0) throw new IllegalArgumentException("Fish age is wrong, max age is 20 years");
    }

    public void printInfo() {
        System.out.println("Your fish:");
        super.printInfo();
        System.out.println("-------------------------------");
    }
}
