package SpringPractice1.service;

import SpringPractice1.dto.StudentDto;
import SpringPractice1.entity.StudentEntity;
import SpringPractice1.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public void addStudent(StudentDto studentDto) {
         studentRepo.save(StudentEntity.builder()
                 .id(studentDto.getId())
                 .name(studentDto.getName())
                 .age(studentDto.getAge())
                 .build());

    }
}

//employeeRepository.save(Employee.builder().name(employeeDTO.getName()).empId(employeeDTO.getEmpId()).role(employeeDTO.getRole()).build());
///*employeeDTO.setId(employeeEntity.getId());