public class Main {
    public static void main(String[] args) {
        Person p = new Person("Costel", 24);
//        p.name = "Costel";
//        p.age = 24;
//        p.hello();

        MyMath m = new MyMath();
//        System.out.println(m.add(2,3));
//        System.out.println(m.add(2, 2.0F));
//        System.out.println(m.add(2.0f, 2.2f));
//        System.out.println(m.add(2,3, 5));

//        m.average(1, 2, 4, 5, 6, 7);

        PrintingPatterns printingPatterns = new PrintingPatterns(2, 6);
//        printingPatterns.printLine();

        printingPatterns.printRectangle(printingPatterns.height, printingPatterns.width );
    }
}