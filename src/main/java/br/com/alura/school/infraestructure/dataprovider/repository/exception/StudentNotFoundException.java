package br.com.alura.school.infraestructure.dataprovider.repository.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message) {
        super(message);
    }
}
