package lessons.Lesson11;

public class App1 {
    public static void main(String[] args) {
        Address myAddress = new Address("188 Conchita lane", "Austin",State.FL,1488);
        System.out.println(myAddress);

        Subjects[] pavelSubj = {Subjects.CS,Subjects.ENGLISH,Subjects.MATH};
        Student pavel = new Student(pavelSubj,"Pavel Belov",Subjects.CS);
    }
}
