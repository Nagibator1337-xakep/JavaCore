package Lesson11;

public class App {
    public static void main(String[] args) {
        Colours pants = Colours.YELLOW;
        String pantsColour = "Green";
        // "GREEN", "green"

        School mouSosh108 = new School("MOU SOSH 108", SchoolType.PUBLIC);
        School xx = new School("SPb Lutheran School",SchoolType.PRIVATE);
        System.out.println(xx.getName());
        System.out.println(xx.getType());
        System.out.println(xx);

    }
}
