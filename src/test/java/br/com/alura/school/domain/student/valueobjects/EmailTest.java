package br.com.alura.school.domain.student.valueobjects;

import br.com.alura.school.domain.student.valueobjects.Email;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class EmailTest {


    @Test
    @DisplayName("Should pass when receive a valid email.")
    void isEmailValid(){

        Assertions.assertDoesNotThrow(() -> new Email("jhon.doe@gmail.com"));

    }

    @Test
    @DisplayName("Should throw when receive an empty email.")
    void isEmailValid2(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(""));

    }

    @Test
    @DisplayName("Should throw when receive an email without '.com'.")
    void isEmailValid3(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email("jhon@gmail"));

    }

    @Test
    @DisplayName("Should throw when receive an email with lenght less then 9 characters.")
    void isEmailValid4(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email("jn@g.com"));

    }

}