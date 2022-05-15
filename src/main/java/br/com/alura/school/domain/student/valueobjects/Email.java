package br.com.alura.school.domain.student.valueobjects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;


@Getter
@NoArgsConstructor
public class Email implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String address;

    public Email(String address) {

        if(isEmailValid(address)) {

            this.address = address.trim();
        }
    }

    private boolean isEmailValid(String email){

        if (email.isEmpty() || email.isBlank()){
            throw new IllegalArgumentException("Email field can't be empty");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email should contain '@'.");
        }
        if (!email.contains(".com") || email.length() < 9){
            throw new IllegalArgumentException("Inválid email format.");
        }
        return true;
    }

    @Override
    public String toString() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Email email1 = (Email) o;
        return address != null && Objects.equals(address, email1.address);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
