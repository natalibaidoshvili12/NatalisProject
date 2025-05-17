import java.time.LocalDateTime;

public class Person {

    private String name;
    private String lastname;
    private LocalDateTime birthDate;
    private String pin;

    public Person() {

    }

    public Person(String name, String lastname, LocalDateTime birthDate, String pin) {
        this.name = name;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
