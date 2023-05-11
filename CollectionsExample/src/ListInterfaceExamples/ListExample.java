package ListInterfaceExamples;

import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " | " + "Age: " + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;
        return this.name.equals(p.name) && this.age == p.age;
    }
}

public class ListExample {
    public static void main(String[] args) {
        Person person = new Person("Iulian Vasile",40);
        System.out.println(person);

        List<Person> people = new ArrayList<>();

        people.add(new Person("Vasile", 22));
        people.add(new Person("Costel", 44));
        people.add(new Person("Ionel", 23));
        people.add(new Person("Mihai", 25));
        people.add(new Person("Andrei", 35));

        System.out.println(people);

        System.out.println(people.get(3));
        Person personToBeRemoved = people.remove(0);
        System.out.println(personToBeRemoved);
        System.out.println(people);

        List<Person> people1 = new LinkedList<>();
        people1.add(new Person("Vasile", 22));
        people1.add(new Person("Costel", 44));
        people1.add(new Person("Ionel", 23));
        people1.add(new Person("Mihai", 25));
        people1.add(new Person("Andrei", 35));

        System.out.println("Linked List :"  + people1);
        System.out.println(people1.get(3));

        Set<Person> uniquePeople = new HashSet<>();
        uniquePeople.add(new Person("Vasile", 22));
        uniquePeople.add(new Person("Costel", 44));
        uniquePeople.add(new Person("Ionel", 23));
        uniquePeople.add(new Person("Mihai", 25));
        uniquePeople.add(new Person("Andrei", 35));

        System.out.println(uniquePeople.contains(new Person("Vasile", 22)));
    }
}
