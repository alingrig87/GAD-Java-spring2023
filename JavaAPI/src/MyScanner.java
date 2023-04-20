import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introduceti numarul de aruncari cu zarul: ");
        int n = scanner.nextInt();
        System.out.println("Introduceti o combinatie de zaruri: ");
        String combination = scanner.next();

        System.out.println("Din " + n + " aruncari " + " combinatia " + combination + " a fost aruncata de " + 50 + " ori ");
    }

}
