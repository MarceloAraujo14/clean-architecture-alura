package br.com.alura.school.application.usecases.student;

import br.com.alura.school.domain.student.entity.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@ToString
@Getter
public class StudentOutput {

    private String studentName;
    private String studentCpf;
    private String studentEmail;
    private String studentUsername;

    public StudentOutput(Student student) {
        this.studentName = student.getName();
        this.studentCpf = student.getCpf().getCpfNumber();
        this.studentEmail = student.getEmail().getAddress();
        this.studentUsername = student.getUsername();
    }

    public List<StudentOutput> toOuptupList(List<Student> studentList){
       return studentList.stream()
               .map(student -> new StudentOutput(student))
               .collect(Collectors.toList());
    }


}
