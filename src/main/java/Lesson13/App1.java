package Lesson13;

public class App1 {
    public static void main(String[] args) {
//        Person person = new Person();
        Circle cr1 = new Circle(2.2);
        Shape shape1 = new Circle(2.3);
        Rectangle rec1 = new Rectangle(2,3.1);
        Square sq1 = new Square(5);
        Rectangle rec2 = new Square(2.2);
        Shape shape2 = new Square(4.1);

        Shape[] shapes = {cr1,shape1,rec1,sq1,rec2,shape2};
        for (Shape sh:shapes) {
//            sh.draw();
            System.out.println(sh.getArea());
        }

    }
}
