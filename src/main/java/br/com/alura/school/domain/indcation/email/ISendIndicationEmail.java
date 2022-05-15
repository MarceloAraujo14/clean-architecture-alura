package br.com.alura.school.domain.indcation.email;

import br.com.alura.school.domain.student.entity.Student;

public interface ISendIndicationEmail {

    void sendTo(Student student);
}
