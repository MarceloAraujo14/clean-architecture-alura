package br.com.alura.school.domain.student.service;

import br.com.alura.school.domain.student.entity.Student;

import java.util.List;

public interface IStudentService {

    Student getStudentByCpf(String cpf);

    List<Student> listAllStudents();

    Student enrollStudent(Student student);

    void unenrollStudent(String cpf);

}
