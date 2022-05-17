package br.com.alura.school.infraestructure.rest.indication.retrieveindication;

import br.com.alura.school.application.usecases.indication.retrieveindication.RetrieveIndicationOutput;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RetrieveIndicationPresenter {

    private String indicatedEmail;
    private String pointerName;
    private String pointerEmail;
    private String indicationDate;

    public RetrieveIndicationPresenter(RetrieveIndicationOutput retrieveIndicationOutput) {
        this.indicatedEmail = retrieveIndicationOutput.getIndicatedEmail();
        this.pointerEmail = retrieveIndicationOutput.getPointer().getEmail().getAddress();
        this.pointerName = retrieveIndicationOutput.getPointer().getName();
        this.indicationDate = retrieveIndicationOutput.getIndicationDate();
    }

}
