package Lesson8;

public class App1 {
    public static void main(String[] args) {
        Person pavel = new Person();
        pavel.name = "Pavel";
        pavel.lastName = "Belov";
        pavel.age = 32;

        Person anton = new Person();
        anton.name = "Anton";
        anton.lastName = "Guskov";
        anton.age = 31;

        Person yura = new Person();
        yura.age = 22;
        yura.name = "Yuri";
        yura.lastName = "Belov";
        yura.gender = "Male";

        printPerson(anton);
        printPerson(pavel);
        printPerson(yura);

        Vehicle myCar = new Vehicle();
        myCar.brand = "Honda";
        myCar.model = "Accord";
        myCar.colour = "Black";
        myCar.year = 2021;

        Vehicle myFriendsCar = new Vehicle();
        myFriendsCar.brand = "VAZ";
        myFriendsCar.model = "2106";
        myFriendsCar.colour = "Purple";
        myFriendsCar.year = 1995;

    }
    public static void printPerson(Person person) {
        System.out.println("Name = "+person.name+
                "\nLast name = "+person.lastName+
                "\nAge = "+person.age+
                "\nGender = "+person.gender);
    }
}
