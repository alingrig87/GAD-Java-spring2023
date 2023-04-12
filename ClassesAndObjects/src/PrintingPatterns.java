public class PrintingPatterns {
    public int height;
    public int width;

    public PrintingPatterns(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printLine(int width) {
        for(int i = 1; i <= width; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public void printRectangle(int height, int width) {
        for(int i = 1; i <= height; i++) {
            printLine(width);
        }
    }

    public void printSquare(int width) {
        printRectangle(width, width);
    }
}
