package br.com.alura.school.domain.student.entity;


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
@AllArgsConstructor
public class Student extends User{

    private CPF cpf;
    private String name;
    private Email email;

    private List<PhoneNumber> phoneNumbers = new ArrayList<>();

    public void addPhoneNumber(String ddd, String phoneNumber){
        this.phoneNumbers.add(new PhoneNumber(ddd, phoneNumber));
    }

    public void addUsernamePassword(String username, String password){
        this.setPassword(password);
        this.setUsername(username);
    }

    public Student(CPF cpf, String name, Email email) {
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
