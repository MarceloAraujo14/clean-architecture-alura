package br.com.alura.school.infraestructure.rest.student;

import br.com.alura.school.application.usecases.student.StudentInput;
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
    public StudentResponse enrollStudent(@RequestBody StudentRequest studentDto){
        log.info("Enrolling student: " + studentDto);
        StudentInput student = studentDto.toStudentInput();
        return new StudentResponse(serviceImp.enrollStudent(student));
    }

    @GetMapping
    public List<StudentResponse> listAllStudents(){
        return new StudentResponse().toResponseList(serviceImp.listAllStudents());
    }

}
