package br.com.alura.school;

import br.com.alura.school.domain.student.builder.StudentBuilder;
import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.domain.student.security.IEncrypt;
import br.com.alura.school.domain.student.service.IStudentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

    @Autowired
    private IStudentService serviceImp;
    @Autowired
    private IEncrypt encrypt;


    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        Student student = new StudentBuilder().builder("Jhon", "12345678912", "jhon@gmail.com")
                .addPhoneNumber("21", "9999-9999").build();

        student.setUsername("jhonny.doe");
        student.setPassword("abcd");

        log.info(encrypt.encrypt("abcd"));
        serviceImp.enrollStudent(student);
        log.info(serviceImp.listAllStudents());

        Student testStudent = serviceImp.getStudentByCpf("12345678912");
        log.info(encrypt.encrypt("abcd").equals(testStudent.getPassword()));
    }
}
