package br.com.alura.school.application.usecases.indication.registerindication;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class IndicationRegisterInput {

    private String indicatedEmail;
    private String pointerEmail;

}
