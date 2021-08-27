package lessons.Lesson15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<String,String>();
        countries.put("China","Asia");
        countries.put("France","Europe");
        countries.put("Poland","Europe");
        countries.put("Germany","Europe");
        countries.put("USA","North America");
        countries.put("Canada","North America");

        System.out.println(countries);

        countries.put("Canada","North Pole");

        System.out.println(countries);
        System.out.println(countries.get("Canada"));

        HashMap<Integer,String> colours = new HashMap<Integer,String>();
        List<String> colors = new ArrayList<String>();

        colours.put(0,"Red");
        colours.put(1,"Orange");
        colours.put(2,"Yellow");
        colours.put(3,"Green");
        colours.put(4,"Light Blue");
        colours.put(5,"Blue");
        colours.put(6,"Purple");

        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Light Blue");
        colors.add("Blue");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colours.get(1));

        System.out.println(countries);
        countries.replace("Canada","North America");
        System.out.println(countries);

        String ss = countries.remove("Poland");
        System.out.println(ss);

        boolean bb = countries.containsKey("Poland");
        System.out.println(bb);
        bb = countries.containsValue("Europe");
        System.out.println(bb);

        Map<Fruit,Person> fruitPerson = new HashMap<Fruit, Person>();
        fruitPerson.put(new Fruit(),new Person());
        System.out.println(fruitPerson.size());

        for (String key: countries.keySet()) {
            System.out.println(key);
        }
        System.out.println("----------");
        for (String value: countries.values()) {
            System.out.println(value);
        }
        System.out.println("----------");

        System.out.println(countries.keySet());
        System.out.println(countries.values());

        System.out.println("----------");

        for (Map.Entry<String,String> entry : countries.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }




    }
}
