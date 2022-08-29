package Week2.Day8.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapeArr = new Shape[4];
        Shape shape = new Circle(10);
        shapeArr[0] = shape;

        shape = new Cylinder(10, 12);
        shapeArr[1] = shape;

        shape = new Square(12);
        shapeArr[2] = shape;

        shape = new Rectangle(10, 15);
        shapeArr[3] = shape;

        for (Shape s : shapeArr) {
            s.area();
        }


    }
}

/*

Area of Circle is :: 314.1592653589793
Area of Cylinder is :: 753.9822368615503200
Area of Square is :: 100
Area of Cylinder is :: 150


* */