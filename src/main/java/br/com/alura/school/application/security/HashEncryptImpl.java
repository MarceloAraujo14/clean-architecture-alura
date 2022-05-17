package br.com.alura.school.application.security;

import br.com.alura.school.domain.student.security.IEncrypt;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class HashEncryptImpl implements IEncrypt {

    @Override
    public String encrypt(String password) {
        return String.valueOf(password.hashCode());
    }

}
