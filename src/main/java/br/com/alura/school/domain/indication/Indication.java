package br.com.alura.school.domain.indication;

import br.com.alura.school.domain.student.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Indication {

    private Student indicated;
    private Student pointer;
    private LocalDateTime indicationDate = LocalDateTime.now();
}
