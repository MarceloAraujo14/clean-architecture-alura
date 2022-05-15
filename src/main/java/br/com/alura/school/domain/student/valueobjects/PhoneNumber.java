package br.com.alura.school.domain.student.valueobjects;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;


@Getter
@NoArgsConstructor
public class PhoneNumber implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String ddd;
    private String number;

    public PhoneNumber(String ddd, String number) {

        ddd = formatDdd(ddd);
        number = formatPhoneNumber(number);

        if(!isPhoneNumberValid(ddd, number)){
            throw new IllegalArgumentException("Phone number invalid.");
        }

        this.ddd = ddd;
        this.number = number;
    }

    private boolean isPhoneNumberValid(String ddd, String number){
        return ddd.matches("\\d{2}") &&
                number.matches("\\d{8,9}");
    }

    private String formatPhoneNumber(String number){
        number = (number.contains("-")) ? number.replace("-", ""): number;
        number = (number.contains(".")) ? number.replace(".", ""): number;
        return number.trim().strip();
    }

    private String formatDdd(String ddd){
        ddd = (ddd.contains("(")) ? ddd.replace("(", "") : ddd;
        ddd = (ddd.contains(")")) ? ddd.replace(")", "") : ddd;
        return ddd;
    }

    @Override
    public String toString() {
        return "(" + ddd + ")" + number;
    }
}
