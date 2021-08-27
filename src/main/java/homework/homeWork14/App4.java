package homework.homeWork14;

import java.util.HashMap;
import java.util.Map;

public class App4 {
    public static void main(String[] args) {
        Map<String,String> peopleEmployed = new HashMap<>();
        peopleEmployed.put("Pavel Belov","Unemployed");
        peopleEmployed.put("Yuri Belov","Shavarma cook");
        peopleEmployed.put("Lyubov Belova","School Teacher");
        peopleEmployed.put("Anton Guskov","Engineer-Kabanchick");
        peopleEmployed.put("Maxim Belkin","Programmer");

        System.out.println(peopleEmployed);

        System.out.println(peopleEmployed.get("Pavel Belov"));
        boolean b = peopleEmployed.containsKey("Anton Guskov");
        System.out.println(b);
        b = peopleEmployed.containsKey("Pidor Ebani");
        System.out.println(b);

        peopleEmployed.replace("Pavel Belov","Tuneyadets");
        System.out.println(peopleEmployed.get("Pavel Belov"));
        System.out.println(peopleEmployed);


    }
}
