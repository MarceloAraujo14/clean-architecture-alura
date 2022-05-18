package br.com.alura.school.infraestructure.rest.student;

import br.com.alura.school.application.usecases.student.StudentOutput;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
@ToString
public class StudentResponse {

    private String studentName;
    private String studentCpf;
    private String studentEmail;
    private String studentUsername;

    public StudentResponse(StudentOutput studentOutput) {
        this.studentName = studentOutput.getStudentName();
        this.studentCpf = studentOutput.getStudentCpf();
        this.studentEmail = studentOutput.getStudentEmail();
        this.studentUsername = studentOutput.getStudentUsername();
    }

    public List<StudentResponse> toResponseList(List<StudentOutput> outputList){
        return outputList.stream()
                .map(studentOutput -> new StudentResponse(studentOutput))
                .collect(Collectors.toList());
    }

}
