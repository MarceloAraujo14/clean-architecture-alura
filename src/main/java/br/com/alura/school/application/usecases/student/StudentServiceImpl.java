package br.com.alura.school.application.usecases.student;

import br.com.alura.school.domain.student.dataprovider.IStudentRepository;
import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.domain.student.security.IEncrypt;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class StudentServiceImpl {

    private final IStudentRepository studentRepository;
    private final IEncrypt encrypt;

    public Student getStudentByCpf(String cpf) {
        return studentRepository.getStudentByCpf(cpf);
    }

    public List<Student> listAllStudents() {
        return studentRepository.listAllStudents();
    }

    public Student enrollStudent(Student student) {
        student.setPassword(encrypt.encrypt(student.getPassword()));
        return studentRepository.enrollStudent(student);
    }

    public void unenrollStudent(String cpf) {
        studentRepository.unenrollStudent(cpf);
    }

}
