package br.com.alura.school.domain.student.entity;

import br.com.alura.school.domain.student.valueobjects.Password;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
public abstract class User {

    private String username;
    private Password password;

    protected User(String username, String password) {
        this.username = username;
        this.password = new Password(password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return  "username='" + username + '\'' +
                ", password='" + password + '\'';
    }
}
