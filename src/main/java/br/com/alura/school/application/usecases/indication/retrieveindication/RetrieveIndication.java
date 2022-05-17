package br.com.alura.school.application.usecases.indication.retrieveindication;

import br.com.alura.school.domain.indication.dataprovider.IIndicationRepository;
import br.com.alura.school.domain.indication.entity.Indication;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RetrieveIndication {

    private final IIndicationRepository indicationRepository;

    public RetrieveIndicationOutput retrieveIndication(String retrieveIndication){
        Indication indicationByIndicatedEmail = indicationRepository.getIndicationByIndicatedEmail(retrieveIndication);
        return new RetrieveIndicationOutput(indicationByIndicatedEmail);
    }

}
