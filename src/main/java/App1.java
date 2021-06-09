public class App1 {
    public static void main(String[] args) {
        String xx = "Jay";
        String result = getHello(xx);
        String secondResult = getHello(getHello(result));
        System.out.println(secondResult);
    }

    public static String getHello(String name) {
        return "Hello, " + name;
    }
}
