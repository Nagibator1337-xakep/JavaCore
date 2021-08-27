package lessons.Lesson12;

public class App {
    public static void main(String[] args) {
        Address pavelAddress = new Address("188 Conchita Ln.","Dededo",State.GU,96929);
        String name = "Pavel";
        String lastName = "Belov";
        Person pavel = new Person(name,lastName,pavelAddress);

//        Person pavel = new Person("Pavel","Belov",pavelAddress);
//        Person pavel = new Person("Pavel","Belov",new Address("188 Conchita Ln.","Dededo",State.GU,96929));
        pavelAddress.setCity("Barrigada");
        String streetName = pavel.getAddress().getStreetName();
        System.out.println(streetName);
        String city = pavel.getAddress().getCity();
        System.out.println(city);
        State state = pavel.getAddress().getState();
        System.out.println(state);
    }
}
