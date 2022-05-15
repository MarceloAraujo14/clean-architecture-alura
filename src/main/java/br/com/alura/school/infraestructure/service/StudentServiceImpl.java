package br.com.alura.school.infraestructure.service;

import br.com.alura.school.domain.student.dataprovider.IStudentRepository;
import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.domain.student.security.IEncrypt;
import br.com.alura.school.domain.student.service.IStudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {

    private final IStudentRepository studentRepository;
    private final IEncrypt encrypt;

    @Override
    public Student getStudentByCpf(String cpf) {
        return studentRepository.getStudentByCpf(cpf);
    }

    @Override
    public List<Student> listAllStudents() {
        return studentRepository.listAllStudents();
    }

    @Override
    public Student enrollStudent(Student student) {
        log.info(student);
        student.setPassword(encrypt.encrypt(student.getPassword()));
        return studentRepository.enrollStudent(student);
    }

    @Override
    public void unenrollStudent(String cpf) {
        studentRepository.unenrollStudent(cpf);
    }

}
