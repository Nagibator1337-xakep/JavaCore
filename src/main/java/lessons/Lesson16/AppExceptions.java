package lessons.Lesson16;

public class AppExceptions {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
//        int b = numbers[8];
//        int xx = 5/0;

//        throw new NegativeArraySizeException("You did wrong");

        System.out.println("Before try/catch block");
    try {
        System.out.println("Before potential blow up");
        int xx = 5/1;
        int b = numbers[1];
        System.out.println("After potential problem");
        throw new MyException("My own Exception!!! How awesome is that?");

    } catch (ArithmeticException error) {
        System.out.println("Inside catch block");
    } catch (ArrayIndexOutOfBoundsException error) {
        System.out.println("Inside second catch block");
    } catch (MyException e) {
        System.out.println("Error: "+e.getMessage());
    } finally {
        System.out.println("Finally block will happen in any case");
    }
        System.out.println("After catch block");

    }
}
