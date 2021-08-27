package lessons.Lesson14;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Colours> colours = new ArrayList<Colours>();
        colours.add(Colours.BLUE);
        colours.add(Colours.BLUE);
        colours.add(Colours.CRIMSON);
        colours.add(Colours.GREY);
        System.out.println(colours);


        Person sam = new Person("Samuel","Jackson");

        Person mary = new Person("Mary","Sue");

        List<Person> people = new ArrayList<Person>();
        people.add(sam);
        people.add(mary);
        people.add(new Person("George","Bush"));
        System.out.println(people);

    }
}
