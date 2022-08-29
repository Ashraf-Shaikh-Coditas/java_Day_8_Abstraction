package Week2.Day8.Shape;

public class Square extends Shape {

    int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void area() {
        int side = 10;
        System.out.println("Area of Square is :: " + side * side);
    }
}
