package br.com.alura.school.infraestructure.rest.student;

import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.application.usecases.student.EnrollStudentDto;
import br.com.alura.school.application.usecases.student.StudentServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/student")
@Log4j2
public class StudentRestControllerImpl{

    private final StudentServiceImpl serviceImp;

    @PostMapping()
    public Student enrollStudent(@RequestBody EnrollStudentDto enrollStudentDto){
        log.info("Enrolling student: " + enrollStudentDto);
        Student student = enrollStudentDto.toStudent();
        return serviceImp.enrollStudent(student);
    }

    @GetMapping
    public List<Student> listAllStudents(){
        return serviceImp.listAllStudents();
    }

}
