package br.com.alura.school.infraestructure.rest.indication.retrieveindication;

import br.com.alura.school.application.usecases.indication.retrieveindication.RetrieveIndication;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@RequestMapping("/indication")
public class RetrieveIndicationEndpoint {

    private final RetrieveIndication retriveIndication;

    @GetMapping("/{email}")
    public RetrieveIndicationPresenter getIndication(@PathVariable String email){
        return new RetrieveIndicationPresenter(retriveIndication.retrieveIndication(email));
    }

}
