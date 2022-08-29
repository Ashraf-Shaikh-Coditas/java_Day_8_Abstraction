package Week2.Day8.Shape;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void area() {
        System.out.println("Area of Circle is :: " + Math.PI * this.radius * this.radius);
    }
}
