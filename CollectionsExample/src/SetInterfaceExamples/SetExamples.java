package SetInterfaceExamples;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banane");
        fruits.add("orange");
        fruits.add("apple");

        System.out.println(fruits);

        System.out.println(fruits.contains("apple"));
        System.out.println( fruits.remove("apples"));
    }
}
