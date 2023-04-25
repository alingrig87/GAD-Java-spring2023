package abstraction.animal;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Rex", 3);
        Animal myCat = new Cat("Fluffy");

        System.out.print(myDog.getName() + " says ");
        myDog.makeSound();

        System.out.print(myCat.getName() + " says ");
        myCat.makeSound();
    }

}
