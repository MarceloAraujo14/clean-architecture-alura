package br.com.alura.school.infraestructure.email;

import br.com.alura.school.domain.indication.email.ISendIndicationEmail;
import br.com.alura.school.domain.student.entity.Student;

public class SendIndicationEmail implements ISendIndicationEmail {
    @Override
    public void sendTo(Student student) {
        //send email to student.email
    }
}
