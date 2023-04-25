package abstraction.animal;

public class Dog extends Animal{
    int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("how how");
    }
}
