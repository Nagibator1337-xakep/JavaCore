package lessons.Lesson12;

public class App2 {
    public static void main(String[] args) {
        Person1 pavel = new Person1("Pavel");
//        System.out.println(pavel.getName());

        Person1 alex = new Student("Alex","Math");
//        System.out.println(alex.getName());

        Person1 jane = new Person1("Jane");
        Person1 mary = new Student("Mary","History");
        Student jake = new Student("Jake","CS");

        Person1[] people = {pavel,alex,jane,mary,jake};
        for (Person1 p: people) {
            System.out.println(p.getName());
        }
    }
}
