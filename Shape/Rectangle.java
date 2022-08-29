package Week2.Day8.Shape;

public class Rectangle extends Square {

    int breadth;

    public Rectangle(int side, int breadth) {
        super(side);
        this.breadth = breadth;
    }


    @Override
    public void area() {

        System.out.println("Area of Cylinder is :: " + this.getSide() * breadth);
    }

}
