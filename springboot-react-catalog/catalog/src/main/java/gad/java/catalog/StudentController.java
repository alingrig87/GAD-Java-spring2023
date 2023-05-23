package gad.java.catalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudent() {
        return List.of(
                new Student(UUID.randomUUID(), "John", "Doe", new Integer[]{10, 9, 8}, 9),
                new Student(UUID.randomUUID(), "Jane", "Smith", new Integer[]{7, 8, 9}, 8),
                new Student(UUID.randomUUID(), "Alice", "Johnson", new Integer[]{6, 7, 8}, 7),
                new Student(UUID.randomUUID(), "Bob", "Williams", new Integer[]{8, 9, 10}, 9),
                new Student(UUID.randomUUID(), "Emily", "Brown", new Integer[]{9, 9, 9}, 9),
                new Student(UUID.randomUUID(), "Michael", "Jones", new Integer[]{7, 8, 7}, 7),
                new Student(UUID.randomUUID(), "Olivia", "Taylor", new Integer[]{9, 10, 9}, 9),
                new Student(UUID.randomUUID(), "David", "Miller", new Integer[]{8, 7, 6}, 7),
                new Student(UUID.randomUUID(), "Sophia", "Anderson", new Integer[]{10, 10, 9}, 10),
                new Student(UUID.randomUUID(), "Jacob", "Wilson", new Integer[]{9, 8, 9}, 9)
        );

    }
}
