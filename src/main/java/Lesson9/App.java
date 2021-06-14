package Lesson9;

public class App {
    public static void main(String[] args) {
        Person pavel = new Person();
        pavel.setName("Pavel");
        pavel.setLastName("Belov");
        pavel.setYear(2020);

        int xx = pavel.getYear();
        System.out.println(xx);

        Person anton = new Person("Anton","Gusbkov",1990);
        System.out.println(anton.getLastName());

        Vehicle vv = new Vehicle();


        Person yura = new Person("Yura","Belov");
        yura.setYear(1998);
    }
}
