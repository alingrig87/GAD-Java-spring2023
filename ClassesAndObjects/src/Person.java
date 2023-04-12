public class Person {
    String name;
    String firstName;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Hello I'm " + name + " and I have " + age + " years old");
    }
}
