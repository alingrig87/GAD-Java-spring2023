package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5,10);
        shape1.calculateArea();

        Shape shape2 = new Circle(10);
        shape2.calculateArea();

        Cloneable words = new ArrayList<>();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(new Rectangle(2,5));
        shapes.add(new Circle(8));
        shapes.add(new Circle(232));
        shapes.add(new Circle(44));
        shapes.add(new Rectangle(3,2));
        shapes.add(new Rectangle(1,1));
        shapes.add(new Rectangle(223,22));
        shapes.add(new Circle(222));
        shapes.add(new Shape());

        for(Shape s: shapes) {
            s.calculateArea();
        }
    }
}
