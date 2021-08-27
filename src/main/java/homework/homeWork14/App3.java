package homework.homeWork14;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        Person pavel = new Person("Pavel","Belov",32);
        Person yuri = new Person("Yuri","Belov",22);
        Person anton = new Person("Anton","Guskov",32);
        Person max = new Person("Maxim","Belkin",33);
        Person alex = new Person("Alexander","Sobachkin",34);

        List<Person> people = new ArrayList<>();
        people.add(pavel);
        people.add(yuri);
        people.add(anton);
        people.add(alex);

//        people.add(2,max);

//        for (Person p: people) {
//            p.setAge(100);
//        }
        people.set(3,max);


        for (Person p:people) {
            System.out.println(p.toString());
        }


    }
}
