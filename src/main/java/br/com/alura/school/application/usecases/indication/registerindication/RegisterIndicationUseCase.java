package br.com.alura.school.application.usecases.indication.registerindication;

import br.com.alura.school.domain.indication.dataprovider.IIndicationRepository;
import br.com.alura.school.domain.indication.entity.Indication;
import br.com.alura.school.domain.student.dataprovider.IStudentRepository;
import br.com.alura.school.domain.student.entity.Student;
import br.com.alura.school.domain.student.valueobjects.Email;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class RegisterIndicationUseCase {

    private final IStudentRepository studentRepository;
    private final IIndicationRepository indicationRepository;

    public IndicationRegisterOutput register(IndicationRegisterInput indicationRegister) {

        Email indicated = new Email(indicationRegister.getIndicatedEmail());
        Student pointer = studentRepository.getStudentByEmail(indicationRegister.getPointerEmail());

        indicationRepository.saveIndication(new Indication(indicated,pointer));

        return new IndicationRegisterOutput(indicated,pointer.getEmail(), LocalDateTime.now());
    }

}
