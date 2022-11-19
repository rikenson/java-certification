package rj.learning;
import java.time.LocalDate;

public abstract class Animal {

    protected LocalDate birthdate;

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
