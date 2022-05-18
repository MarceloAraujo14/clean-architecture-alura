package br.com.alura.school.infraestructure.rest.student;

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
    public StudentResponse enrollStudent(@RequestBody StudentRequest studentRequest){
        log.info("Enrolling student: " + studentRequest);
        return new StudentResponse(
                serviceImp.enrollStudent(studentRequest.toStudentInput()));
    }

    @GetMapping
    public List<StudentResponse> listAllStudents(){
        return new StudentResponse()
                .toResponseList(serviceImp.listAllStudents());
    }

}
