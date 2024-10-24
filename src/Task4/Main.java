package Task4;

public class Main {
    public static void main(String[] args) {

        ShapeBuilder shapeBuilder = new ShapeBuilder();

        Shape circle = new Circle(5);
        Shape square = new Square(4);

        System.out.println("Areal af cirklen: " + circle.getArea());
        System.out.println("Areal af kvadratet: " + square.getArea());

        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        System.out.println("Total area: " + shapeBuilder.getTotalArea());

    }
}
