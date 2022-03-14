package by.academy.it.task02individual.task70.entity;

import java.beans.JavaBean;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.util.Optional;

@JavaBean
public class Man implements Serializable {

    private final String name;
    private final String surname;
    private final String patronymic;
    private final LocalDate dateOfBirth;

    public Man(String name, String surname, String patronymic, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public Optional<Long> getAge() {
        try {
            return Optional.of(dateOfBirth.datesUntil(LocalDate.now(), Period.ofYears(1)).count());
        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return Objects.equals(name, man.name) &&
                Objects.equals(surname, man.surname) &&
                Objects.equals(patronymic, man.patronymic) &&
                Objects.equals(dateOfBirth, man.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
