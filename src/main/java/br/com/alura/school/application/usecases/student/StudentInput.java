package br.com.alura.school.application.usecases.student;

import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.domain.student.valueobjects.CPF;
import br.com.alura.school.domain.student.valueobjects.Email;
import lombok.ToString;

@ToString
public class StudentInput {

    private String studentName;
    private String studentCpf;
    private String studentEmail;
    private String studentPassword;
    private String studentUsername;

    public StudentInput(String studentName,
                        String studentCpf,
                        String studentEmail,
                        String studentPassword,
                        String studentUsername) {
        this.studentName = studentName;
        this.studentCpf = studentCpf;
        this.studentEmail = studentEmail;
        this.studentPassword = studentPassword;
        this.studentUsername = studentUsername;
    }

    public Student toStudent(){
        return new Student(
                new CPF(studentCpf),
                studentName,
                new Email(studentEmail),
                studentUsername,
                studentPassword

        );
    }



}
