package homework.homeWork10;

public class HomeAnimal {
    protected String type;
    protected String name;
    protected Gender gender;
    protected int age;

    public HomeAnimal() {
        this.type = null;
    }

    public HomeAnimal(String name, Gender gender, int age) {
        this.type = null;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public HomeAnimal(String type, String name, Gender gender, int age) {
        this.type = type;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void printInfo() {
        if (this.type == null ) {
            System.out.printf(
                "Name - %s;\n" +
                "Gender - %s;\n" +
                "Age - %d\n",
                this.name,this.gender,this.age);
        } else {
            System.out.printf(
                "Your "+this.type+":\n" +
                "Name - %s;\n" +
                "Gender - %s;\n" +
                "Age - %d\n" +
                "-------------------------------\n",
                this.name,this.gender,this.age);
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public Gender getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
