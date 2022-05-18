package br.com.alura.school.domain.indication.dataprovider;

import br.com.alura.school.domain.indication.entity.Indication;

import java.util.List;

public interface IIndicationRepository {

    void saveIndication(Indication indication);

    Indication getIndicationByIndicatedEmail(String email);

    List<Indication> listAllIndication();
}
