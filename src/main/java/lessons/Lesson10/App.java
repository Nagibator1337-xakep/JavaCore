package lessons.Lesson10;

public class App {
    public static void main(String[] args) {
        // Classes start with Capital Letters. Class name == File name
        // variables start with lowercase letters
        // functions start with lowercase letters
        // final variables (constants), enum members - ALL CAPS
        // Java uses camelCase not a snake_case

        Student pavel = new Student("Pavel","Belov",1989,"SUSU","Design Engineer");
        System.out.println(pavel.getLastName());

        Teacher sidor = new Teacher("Valentin","Sidorenko",1917,"Automatics");
        TempTeacher mrTemp = new TempTeacher("Alex","Temp",1985,"Math","January");
        Teacher xx = new TempTeacher("Pidor","Ebany",2000,"Pederasty","December");
    }
}
