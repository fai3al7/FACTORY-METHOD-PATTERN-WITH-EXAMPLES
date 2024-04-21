

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        CircleGeometry circleGeometry = new CircleGeometry();
        SquareGeometry squareGeometry = new SquareGeometry();
        TriangleGeometry triangleGeometry = new TriangleGeometry(); // Adding TriangleGeometry

        shapes.add(circleGeometry.createShape());
        shapes.add(squareGeometry.createShape());
        shapes.add(squareGeometry.createShape());
        shapes.add(triangleGeometry.createShape()); // Adding triangle shape

        for (Shape s : shapes) {
            s.draw();
        }
    }
}
