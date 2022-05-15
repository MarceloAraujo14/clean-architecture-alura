package br.com.alura.school.domain.student.valueobjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@EqualsAndHashCode
public class CPF{

    private String cpfNumber;

    public CPF(String cpfNumber) {

        cpfNumber = cpfFormat(cpfNumber);

        if (!isCPFValid(cpfNumber)){
            throw new IllegalArgumentException("Inválid CPF format");
        }

        this.cpfNumber = cpfNumber;
    }

    private boolean isCPFValid(String cpf){

        return cpf.matches("^\\d{11}+$");
    }

    private String cpfFormat(String cpf){

        cpf = (cpf.contains("-")) ? cpf.replace("-", "") : cpf;
        cpf = (cpf.contains(".")) ? cpf.replace(".", "") : cpf;
        cpf = (cpf.contains(" ")) ? cpf.replace(" ", "") : cpf;

        return cpf;
    }

    @Override
    public String toString() {
        return cpfNumber;
    }
}
