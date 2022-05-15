package br.com.alura.school.domain.student.valueobjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {

    @Test
    void isPhoneNumberValid(){

        assertDoesNotThrow(() -> new PhoneNumber("21", "9999-9999"));

    }

    @Test
    void isPhoneNumberValid2(){

        assertDoesNotThrow(() -> new PhoneNumber("(21)", "99999-9999"));

    }

    @Test
    void isPhoneNumberValid3(){

        assertThrows(IllegalArgumentException.class, () -> new PhoneNumber("1", "9999-9999"));

    }

    @Test
    void isPhoneNumberValid4(){

        assertThrows(IllegalArgumentException.class, () -> new PhoneNumber("(21)", "9999999"));

    }

}