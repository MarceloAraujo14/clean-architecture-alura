package br.com.alura.school.domain.student.builder;

import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.domain.student.valueobjects.CPF;
import br.com.alura.school.domain.student.valueobjects.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class StudentBuilderTest {

    @Test
    void StudentBuilder(){
        Student student = new StudentBuilder()
                .builder("Jhon Doe", "12345678912", "jhon.doe@gmail.com")
                .build();

        assertInstanceOf(Student.class, student);
    }

    @Test
    void StudentBuilder2(){

        Student expect = new Student(new CPF("12345678912"), "Jhon Doe", new Email("jhon.doe@gmail.com"));

        Student result = new StudentBuilder()
                .builder("Jhon Doe", "12345678912", "jhon.doe@gmail.com")
                .build();

        assertEquals(expect, result);
    }

    @Test
    void StudentBuilder3(){

        Student expect = new Student(new CPF("12345678912"), "Jhon Doe", new Email("jhon.doe@gmail.com"));
        expect.addPhoneNumber("21", "9999-99999");

        Student result = new StudentBuilder()
                .builder("Jhon Doe", "12345678912", "jhon.doe@gmail.com")
                .addPhoneNumber("21", "9999-99999")
                .build();

        assertEquals(expect, result);
    }

}