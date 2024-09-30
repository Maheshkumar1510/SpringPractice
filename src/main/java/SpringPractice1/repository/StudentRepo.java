package SpringPractice1.repository;

import SpringPractice1.dto.StudentDto;
import SpringPractice1.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity,Long> {



}
