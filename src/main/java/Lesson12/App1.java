package Lesson12;

public class App1 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        b = 6;
        System.out.println("a = "+a+", b = "+b);

        Fruit f1 = new Fruit("Apple");
        Fruit f2 = f1;

        Fruit fruit = new Fruit(f1.getName());

        f2.setName("Pineapple");
        System.out.println("f1 = "+f1.getName()+" f1 = "+f2.getName());
        System.out.println(fruit.getName());
        int[] arr = {1,1,2};
        int[] arr2 = arr;
        arr2[0] = 5;
        System.out.println(arr[0]);
    }
}
