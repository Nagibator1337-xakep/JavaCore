package homeWork10;

public class Cat extends HomeAnimal {
    private boolean sterilized;

    public Cat() {
    }

    public Cat(String name, Gender gender, int age,boolean sterilized) {
        super(name,gender,age);
        if(age>40 || age<0) throw new IllegalArgumentException("Cat age is wrong, max age is 40 years");
        this.sterilized = sterilized;
    }

    public void printInfo() {
        System.out.println("Your Cat:");
        super.printInfo();
        System.out.printf(
                "Sterilized - %b;\n" +
                "-------------------------------\r\n",
                this.sterilized);
    }

    public boolean isSterilized() {
        return sterilized;
    }
    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    public void meow() {
        if (gender == Gender.F) System.out.println(name+" says - Meow meow ^_^");
        else System.out.println(name+" says - MAAU MAAAU!");
    }
}