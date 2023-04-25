package inheritance;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        area = Math.PI * radius * radius;
        System.out.println("Area of circle = " + area);
    }
}
