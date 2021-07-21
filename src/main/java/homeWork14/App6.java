package homeWork14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App6 {
    public static void main(String[] args) {
        Person pavel = new Person("Pavel","Belov",32);
        Person yuri = new Person("Yuri","Belov",22);
        Person anton = new Person("Anton","Guskov",32);
        Person max = new Person("Maxim","Belkin",33);
        Person alex = new Person("Alexander","Sobachkin",34);

        Job unemployed = new Job("Unemployed",0);
        Job cook = new Job("Cook",32000);
        Job engineer = new Job("Engineer-Kabanchik",50000);
        Job programmer = new Job("Programmer",100000);
        Job electrician = new Job("Electrician",380000);

        Map<Person,Job> employmentTable = new HashMap<>();
        employmentTable.put(pavel,unemployed);
        employmentTable.put(yuri,cook);
        employmentTable.put(anton,engineer);
        employmentTable.put(max,programmer);
        employmentTable.put(alex,electrician);

        for (Map.Entry<Person,Job> entry : employmentTable.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        employmentTable.replace(pavel,unemployed,programmer);
        System.out.println(employmentTable.values());

        System.out.println(containsSameValues(employmentTable));

    }


    public static <K, V> boolean containsSameValues(Map<K,V> myMap) {
        boolean containsBuffer = false;
        List<V> valuesBuffer = new ArrayList<>(myMap.values());
        List<V> repeatedValues = new ArrayList<>();
        for (V values : myMap.values()) {
            valuesBuffer.remove(values);
            if (valuesBuffer.contains(values)) {
                containsBuffer=true;
                repeatedValues.add(values);
            }
        }
        System.out.println("Repeated values: "+repeatedValues);
        return containsBuffer;
    }
}