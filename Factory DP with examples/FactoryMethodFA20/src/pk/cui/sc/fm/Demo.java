package pk.cui.sc.fm;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(factory.createShape("circle"));
        shapes.add(factory.createShape("square"));
        shapes.add(factory.createShape("triangle"));

        for (Shape s : shapes) {
            s.draw();
        }

		
    }

}
