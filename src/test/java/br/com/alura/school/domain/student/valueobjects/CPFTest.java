package br.com.alura.school.domain.student.valueobjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CPFTest {

    @Test
    void isCPFValid(){

        assertDoesNotThrow(() -> new CPF("12345678912"));

    }

    @Test
    void isCPFValid2(){

        assertDoesNotThrow(() -> new CPF("123.456.789-12"));

    }

    @Test
    void isCPFValid3(){
        assertThrows(IllegalArgumentException.class, () -> new CPF("123.456.789"));
    }

}