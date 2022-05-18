package br.com.alura.school.application.usecases.indication.retrieveindication;

import br.com.alura.school.domain.indication.entity.Indication;
import br.com.alura.school.domain.student.entity.Student;
import lombok.Getter;

@Getter
public class RetrieveIndicationOutput {

    private String indicatedEmail;
    private Student pointer;
    private String indicationDate;

    public RetrieveIndicationOutput(Indication indication) {
        this.indicatedEmail = indication.getIndicated().getAddress();
        this.pointer = indication.getPointer();
        this.indicationDate = indication.getIndicationDate().toString();
    }


}
