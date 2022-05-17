package br.com.alura.school.application.usecases.indication.registerindication;

import br.com.alura.school.domain.student.valueobjects.Email;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class IndicationRegisterOutput {

    private String indicatedEmail;
    private String pointerEmail;
    private String indicationDate;

    public IndicationRegisterOutput(Email indicatedEmail, Email pointerEmail, LocalDateTime indicationDate) {
        this.indicatedEmail = indicatedEmail.getAddress();
        this.pointerEmail = pointerEmail.getAddress();
        this.indicationDate = indicationDate.toString();
    }


}
