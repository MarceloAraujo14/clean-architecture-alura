package br.com.alura.school.application.usecases.student;

import br.com.alura.school.domain.student.dataprovider.IStudentRepository;
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

    public StudentOutput getStudentByCpf(String cpf) {
        return new StudentOutput(studentRepository.getStudentByCpf(cpf));
    }

    public List<StudentOutput> listAllStudents() {
        return new StudentOutput().toOuptupList(studentRepository.listAllStudents());
    }

    public StudentOutput enrollStudent(StudentInput student) {
        return new StudentOutput(studentRepository.enrollStudent(student.toStudent()));
    }

    public void unenrollStudent(String cpf) {
        studentRepository.unenrollStudent(cpf);
    }

}
