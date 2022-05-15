package br.com.alura.school.infraestructure.security;

import br.com.alura.school.domain.student.security.IEncrypt;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Primary
@Component
public class UuidEncryptImpl implements IEncrypt {
    @Override
    public String encrypt(String password) {
        return UUID.nameUUIDFromBytes(password.getBytes(StandardCharsets.UTF_8)).toString();
    }
}
