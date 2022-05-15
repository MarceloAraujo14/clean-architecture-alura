package br.com.alura.school.domain.student.controller;

import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.infraestructure.dto.EnrollStudentDto;

import java.util.List;

public interface IStudentController {

    public Student enrollStudent(EnrollStudentDto student);

    public List<Student> listAllStudents();
}
