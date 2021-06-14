package Lesson13;

public class Square extends Rectangle {
    public Square(double length) {
        super(length, length);
    }
    @Override
    public void draw() {
        System.out.println("I draw a square with sides = "+length);
    }
}
