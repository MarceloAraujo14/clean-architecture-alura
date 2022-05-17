package br.com.alura.school.domain.indication.entity;

import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.domain.student.valueobjects.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Indication {

    private Email indicated;
    private Student pointer;
    private LocalDateTime indicationDate = LocalDateTime.now();

    public Indication(Email indicated, Student pointer) {
        this.indicated = indicated;
        this.pointer = pointer;
    }
}
