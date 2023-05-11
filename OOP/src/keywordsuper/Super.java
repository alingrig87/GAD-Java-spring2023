package keywordsuper;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }


    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }

    @Override
    public String toString() {
        return "Name: " + super.name + " Student id: " + this.studentId;
    }
}

public class Super {
    public static void main(String[] args) {
        Student student = new Student("Costel", 24534);
        student.displayInfo();
        System.out.println(student);
    }
}
