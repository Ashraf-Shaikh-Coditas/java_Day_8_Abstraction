package Week2.Day8.Shape;

public class Cylinder extends Circle {
    private int height = 10;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("Area of Cylinder is :: " + 2 * Math.PI * this.getRadius() * this.height + 2 * this.getRadius()
                * this.getRadius());
    }


}
