package br.com.alura.school.infraestructure.rest.student;

import br.com.alura.school.application.usecases.student.StudentInput;
import lombok.ToString;

@ToString
public class StudentRequest {

    private String studentName;
    private String studentCpf;
    private String studentEmail;
    private String studentPassword;
    private String studentUsername;

    public StudentRequest(String studentName,
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

    public StudentInput toStudentInput(){
        return new StudentInput(
                studentCpf,
                studentName,
                studentEmail,
                studentUsername,
                studentPassword

        );
    }



}
