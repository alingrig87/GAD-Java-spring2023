public class Operators {

    public static void main(String[] args) {
        int a = 10;
        int n = 2 + 3 * 10 / 2 - 5;
        boolean isEven = n % 2 == 0;

        System.out.println(2+3+4);
        System.out.println(2+3+"4");
        System.out.println("2"+3+4);

        // ++ --
        int i = 10;
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(++i);

        // 10 + 12 + 12 + 13 + 15
//        System.out.println(i++ + ++i + i++ + i++ + ++i);

        // ==, <, >, <=, >=, !=
        System.out.println(2<5);
        System.out.println(2!=2);
        System.out.println(2 >= 3);
    }
}
