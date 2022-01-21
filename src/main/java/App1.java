public class App1 {
    public static void main(String[] args) {
//        String str1 = "test";
//        String str2 = "test";

        String str1 = new String("test");
        String str2 = new String("test");
        if (str1.intern()==str2.intern()) {
            System.out.println("Одинаковые");
        } else {
            System.out.println("Разные");
        }
    }
}