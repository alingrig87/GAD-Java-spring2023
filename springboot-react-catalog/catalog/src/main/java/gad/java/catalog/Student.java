package gad.java.catalog;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@Setter
@Getter
public class Student {
    private final UUID studentId;
    private String firstName;
    private String lastName;
    private Integer[] grades;
    private Integer average;


}
