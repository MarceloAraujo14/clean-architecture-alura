package br.com.alura.school.domain.student.builder;

import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.domain.student.valueobjects.CPF;
import br.com.alura.school.domain.student.valueobjects.Email;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StudentBuilder {

    private Student student;

    public StudentBuilder builder(String name, String cpf, String email, String username, String password){
        this.student = new Student(new CPF(cpf), name, new Email(email), username, password);
        return this;
    }

    public StudentBuilder addPhoneNumber(String ddd, String phoneNumber){
        this.student.addPhoneNumber(ddd, phoneNumber);
        return this;
    }

    public Student build(){
        return this.student;
    }

}
