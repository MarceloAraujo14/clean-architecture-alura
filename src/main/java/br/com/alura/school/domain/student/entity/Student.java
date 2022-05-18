package br.com.alura.school.domain.student.entity;


import br.com.alura.school.domain.student.exception.AddPhoneNumberException;
import br.com.alura.school.domain.student.valueobjects.CPF;
import br.com.alura.school.domain.student.valueobjects.Email;
import br.com.alura.school.domain.student.valueobjects.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Getter
@NoArgsConstructor
public class Student extends User {

    private CPF cpf;
    private String name;
    private Email email;

    private final List<PhoneNumber> phoneNumbers = new ArrayList<>();

    public void addPhoneNumber(String ddd, String phoneNumber){
        if(this.phoneNumbers.size() >= 2){
            throw new AddPhoneNumberException("Phone number list reach its limit.");
        }
        this.phoneNumbers.add(new PhoneNumber(ddd, phoneNumber));
    }

    public Student(CPF cpf, String name, Email email,String username,String password) {
        super(username,password);
        this.cpf = cpf;
        this.name = name;
        this.email = email;

    }


    @Override
    public String toString() {
        return "Student{" +
                "cpf=" + cpf +
                ", name='" + name + '\'' +
                ", email=" + email +
                ", phoneNumbers=" + phoneNumbers +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return cpf.equals(student.cpf);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
