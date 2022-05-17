package br.com.alura.school.infraestructure.rest.indication.registerindication;

import br.com.alura.school.application.usecases.indication.registerindication.IndicationRegisterInput;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RegisterIndicationDto {

    private String indicatedEmail;
    private String pointerEmail;

    public IndicationRegisterInput toInput(){
        return new IndicationRegisterInput(this.indicatedEmail, this.pointerEmail);
    }
}
