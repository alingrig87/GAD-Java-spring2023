public class Final {
    final int x;
    final int y = 20;
    final static double myPI = 3.14;
    final static double myE = 2.73;

    public Final() {
        x = 10;
    }

    public static void main(String[] args) {
        final int a;
        a = 10;
//        a = 20;
        System.out.println(Final.myPI);
    }
}
