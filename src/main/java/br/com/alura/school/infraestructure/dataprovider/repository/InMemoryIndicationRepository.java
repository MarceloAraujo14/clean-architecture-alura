package br.com.alura.school.infraestructure.dataprovider.repository;

import br.com.alura.school.domain.indication.dataprovider.IIndicationRepository;
import br.com.alura.school.domain.indication.entity.Indication;
import br.com.alura.school.infraestructure.dataprovider.repository.exception.IndicationNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryIndicationRepository implements IIndicationRepository {

    private final List<Indication> indicationList = new ArrayList<>();

    @Override
    public void saveIndication(Indication indication) {
        this.indicationList.add(indication);
    }

    @Override
    public Indication getIndicationByIndicatedEmail(String indicatedEmail) {
        return indicationList.stream()
                .filter(indication -> indication.getIndicated()
                        .getAddress().equals(indicatedEmail)).findFirst()
                .orElseThrow(() -> new IndicationNotFoundException("Indication for this email not found"));
    }

    @Override
    public List<Indication> listAllIndication() {
        return this.indicationList;
    }
}
