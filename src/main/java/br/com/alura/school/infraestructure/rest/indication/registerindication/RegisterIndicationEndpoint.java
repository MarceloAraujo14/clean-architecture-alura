package br.com.alura.school.infraestructure.rest.indication.registerindication;

import br.com.alura.school.application.usecases.indication.registerindication.IndicationRegisterOutput;
import br.com.alura.school.application.usecases.indication.registerindication.RegisterIndicationUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/indication")
public class RegisterIndicationEndpoint {

    private final RegisterIndicationUseCase registerIndicationUseCase;

    @PostMapping
    public IndicationRegisterOutput createIndication(@RequestBody RegisterIndicationDto request){
        return registerIndicationUseCase.register(request.toInput());
    }



}
