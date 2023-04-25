package inheritance;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        area = height * width;
        System.out.println("Area of rectangle = " + area);
    }
}
