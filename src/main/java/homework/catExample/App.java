package homework.catExample;

public class App {
    public static void main(String[] args) {
        Cat murzik = new Cat();
        Cat vaska = null;

        vaska = murzik;

        murzik = null;

        System.out.println(vaska);
        System.out.println(murzik);

        System.out.println("Finish!");
    }
}
