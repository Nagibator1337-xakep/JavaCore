package homework.homeWork14;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App5 {
    public static void main(String[] args) {
        Map<Integer,String> money = new HashMap<>();
        money.put(1,"Рубль");
        money.put(2,"Двушка");
        money.put(5,"Пятак");
        money.put(10,"Чирик");
        money.put(50,"Полтос");
        money.put(100,"Сотка");
        money.put(200,"Двухсотка");
        money.put(500,"Пятихат");
        money.put(1000,"Рубль");
        money.put(2000,"Владивосток");
        money.put(5000,"Пятитысячная");

//        money.replace(1000,"Косарь");
//        money.replace(2,"Два рубля");
        money.replace(200,"Двушка");

        money.forEach((k,v) -> {
            System.out.format("Key: %d, value: %s%n", k,v);
        });
        System.out.println("-----------");
        for (Integer i : money.keySet()) {
            System.out.println(i);
        }
        System.out.println("-----------");
        for (String s : money.values()) {
            System.out.println(s);
        }
        System.out.println("-----------");
        System.out.println(containsSameValues(money));

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
