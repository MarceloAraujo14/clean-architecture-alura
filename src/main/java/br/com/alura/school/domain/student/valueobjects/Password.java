package br.com.alura.school.domain.student.valueobjects;

import br.com.alura.school.application.security.UuidEncryptImpl;
import lombok.Getter;

@Getter
public class Password {

    private String password;

    public Password(String password) {
        this.password = UuidEncryptImpl.ENCRYPT(password);
    }
}
