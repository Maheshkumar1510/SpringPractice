package SpringPractice1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
@AllArgsConstructor
public class StudentEntity {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;


    public StudentEntity() {

    }


}
