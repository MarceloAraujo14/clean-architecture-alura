package br.com.alura.school.infraestructure.dataprovider.repository.student;

import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.domain.student.valueobjects.CPF;
import br.com.alura.school.domain.student.valueobjects.Email;
import br.com.alura.school.domain.student.valueobjects.Password;
import br.com.alura.school.domain.student.valueobjects.PhoneNumber;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@NoArgsConstructor
//@Table(name="tb_student")
//@Entity
public class StudentORM extends Student {

    //@Id
    //@GeneratedValue(strategy="GenerationType.IDENTITY)
    private CPF cpf;
    //@Column(name="name")
    private String name;
    //@Column(name = "email")
    private Email email;
    private String username;
    private Password password;

    //@OneToMany
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();

    public StudentORM(Student student) {
        this.cpf = student.getCpf();
        this.name = student.getName();
        this.email = student.getEmail();
        this.username = student.getUsername();
        this.password = student.getPassword();
        this.phoneNumbers = student.getPhoneNumbers();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StudentORM that = (StudentORM) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cpf);
    }
}
