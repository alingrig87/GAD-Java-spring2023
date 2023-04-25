package abstraction.shape;

public class Main {
    public static void main(String[] args) {
        Shape myCircle = new Circle("red", 5);
        Shape myRectangle = new Rectangle("blue", 5, 10);

        System.out.println("Circle color: " +  myCircle.getColor());
        System.out.println("Cirlce area: " + myCircle.area());

        System.out.println("Rectangle color: " +  myRectangle.getColor());
        System.out.println("Rectangle area: " + myRectangle.area());
    }
}
