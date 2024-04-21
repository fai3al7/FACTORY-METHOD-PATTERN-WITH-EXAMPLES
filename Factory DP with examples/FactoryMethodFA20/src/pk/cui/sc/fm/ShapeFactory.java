package pk.cui.sc.fm;

class ShapeFactory {
    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        return null;
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle is drawn");
    }
}

