package br.com.alura.school.infraestructure.dataprovider.repository.student.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException() {
        super("Student not found.");
    }
}
