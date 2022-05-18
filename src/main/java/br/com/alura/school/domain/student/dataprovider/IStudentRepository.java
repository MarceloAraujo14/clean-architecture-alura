package br.com.alura.school.domain.student.dataprovider;

import br.com.alura.school.domain.student.entity.Student;

import java.util.List;


public interface IStudentRepository {

    Student getStudentByCpf(String cpf);

    Student getStudentByEmail(String email);

    List<Student> listAllStudents();

    Student enrollStudent(Student student);


    void unenrollStudent(String cpf);
}
