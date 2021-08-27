package lessons.Lesson14;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        int a1 = 1488;
//        int b1 = 2;
//        Integer a = a1;
//        System.out.println(a.toString());

        List<String> list = new ArrayList<String>();
        list.add("Colour");
        list.add("Pencil");
        list.add("Cow");
        System.out.println(list);
        list.add("Car");
        System.out.println(list);
        System.out.println(list.get(1));
        // add(value) -> adding values to ArrayList
        // get(index) -> returns element with index
        // set(index,value) -> setting element with index to new value
        list.set(2,"Sheep");
        System.out.println(list);
        list.add(1,"New");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(list.size()-1));
        list.add("Pencil");
        System.out.println(list);
        Boolean xx = list.remove("Pencil");
        System.out.println(list);
        System.out.println(xx);

        list.add(1,"Pencil");
        System.out.println(list);

        while (list.contains("Pencil")) {
            list.remove("Pencil");
            System.out.println(list);
        }

        for (String ss: list) {
            System.out.println(ss);
        }
        System.out.println("---------------");
        list.forEach(ss-> System.out.println(ss));
        list.forEach(System.out::println);
    }
}
