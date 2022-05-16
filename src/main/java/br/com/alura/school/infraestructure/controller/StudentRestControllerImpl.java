package br.com.alura.school.infraestructure.controller;

import br.com.alura.school.domain.student.controller.IStudentController;
import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.infraestructure.dto.EnrollStudentDto;
import br.com.alura.school.infraestructure.service.StudentServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/student")
@Log4j2
public class StudentRestControllerImpl implements IStudentController {

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
