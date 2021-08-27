package lessons.Lesson13;

public class Rectangle implements Shape {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("I draw a rectangle with a = "+length+", b = "+width);
    }

    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public double getArea() {
        return width*length;
    }
}
