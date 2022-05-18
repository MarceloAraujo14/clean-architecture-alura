package br.com.alura.school.infraestructure.dataprovider.repository.student;

import br.com.alura.school.domain.student.dataprovider.IStudentRepository;
import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.infraestructure.dataprovider.repository.student.exception.StudentNotFoundException;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Primary
@Repository
public class InMemoryStudentRepository implements IStudentRepository {

    private final List<Student> studentList = new ArrayList<>();

    @Override
    public Student getStudentByCpf(String cpf) {
        return this.studentList.stream()
                .filter(student -> student.getCpf().getCpfNumber().equals(cpf)).findFirst()
                .orElseThrow(StudentNotFoundException::new);
    }

    @Override
    public Student getStudentByEmail(String email) {
        return this.studentList.stream()
                .filter(student -> student.getEmail().getAddress().equals(email)).findFirst()
                .orElseThrow(StudentNotFoundException::new);
    }

    @Override
    public List<Student> listAllStudents() {
        return this.studentList;
    }

    @Override
    public Student enrollStudent(Student student) {
        StudentORM studentORM = new StudentORM(student);
        this.studentList.add(studentORM);
        return student;
    }

    @Override
    public void unenrollStudent(String cpf) {
        this.studentList.remove(
                studentList.stream().filter(student -> student.getCpf().getCpfNumber().equals(cpf)).findFirst()
                        .orElseThrow(StudentNotFoundException::new));
    }
}
