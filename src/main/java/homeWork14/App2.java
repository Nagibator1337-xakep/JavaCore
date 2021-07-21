package homeWork14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) {
        List<String> sovietRepublics = new ArrayList<String>();
        sovietRepublics.add("Russia");
        sovietRepublics.add("Ukraine");
        sovietRepublics.add("Belarus");
        sovietRepublics.add("Latvia");
        sovietRepublics.add("Lithuania");
        sovietRepublics.add("Estonia");
        sovietRepublics.add("Moldova");
        sovietRepublics.add("Georgia");
        sovietRepublics.add("Armenia");
        sovietRepublics.add("Azerbaijan");
        sovietRepublics.add("Kazakhstan");
        sovietRepublics.add("Tajikistan");
        sovietRepublics.add("Turkmenistan");
        sovietRepublics.add("Kyrgyzstan");
        sovietRepublics.add("Uzbekistan");
        sovietRepublics = sovietRepublics.stream().sorted().collect(Collectors.toList());

        int i=1;
        for (String s : sovietRepublics) {
            System.out.println(i+". "+s);
            i++;
        }

        sovietRepublics.remove("Lithuania");
        sovietRepublics.remove("Latvia");
        sovietRepublics.remove("Estonia");
        sovietRepublics.remove("Armenia");
        sovietRepublics.remove("Georgia");
        sovietRepublics.remove("Ukraine");
        sovietRepublics.remove("Belarus");
        sovietRepublics.remove("Moldova");
        sovietRepublics.remove("Azerbaijan");
        sovietRepublics.remove("Kyrgyzstan");
        sovietRepublics.remove("Uzbekistan");
        sovietRepublics.remove("Tajikistan");
        sovietRepublics.remove("Turkmenistan");
        sovietRepublics.remove("Russia");

        System.out.println(sovietRepublics.get(0) + " is now the whole Soviet Union");
    }
}
