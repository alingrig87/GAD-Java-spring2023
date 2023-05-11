package interfaces;

public class Circle implements Drawable, Resizable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Am desenat un cerc cu raza " +  this.radius);
    }

    @Override
    public void resize(int percentage) {
        this.radius = this.radius * percentage;
        System.out.println("Am redimensionat cercul la raza: " + this.radius);
    }


}
