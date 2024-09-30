package SpringPractice1.dto;

import lombok.*;

@Setter
@Getter
@Data

@Builder
public class StudentDto {
    // Getters and Setters
    private int id;
    private String name;
    private int age;
    // Constructor
    public StudentDto(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}


