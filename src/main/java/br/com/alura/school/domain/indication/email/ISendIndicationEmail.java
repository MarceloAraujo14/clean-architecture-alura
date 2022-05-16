package br.com.alura.school.domain.indication.email;

import br.com.alura.school.domain.student.entity.Student;

public interface ISendIndicationEmail {

    void sendTo(Student student);
}
