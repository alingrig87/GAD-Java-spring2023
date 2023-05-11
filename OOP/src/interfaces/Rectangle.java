package interfaces;

public class Rectangle implements Drawable, Resizable{
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Am desenat un dreptunghi cu inaltimea " + this.height + " si latimea " + this.width);
    }

    @Override
    public void resize(int percentage) {
        this.width = this.width * percentage;
        this.height = this.height * percentage;
        System.out.println("Am redimensionat dreptunghiul");
    }
}
