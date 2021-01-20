package generic.methods;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

class Person implements Comparable<Person> {

    private final long id;
    private final String name;
    private final String surname;
    private final LocalDate dateOfBirth;

    public Person(long id, String name, String surname, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int compareTo(Person person) {
        return Long.compare(this.id, person.id);
    }

    List<Person> getListOfPeople() {
        return List.of(new Person(1, "Jan", "Kowalski", LocalDate.now()),
                        new Person(2, "Krzysztof", "Kowalski", LocalDate.now()),
                        new Person(3, "Maria", "Kowalska", LocalDate.now()),
                        new Person(4, "Halina", "Kowalska", LocalDate.now()));
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Surname: %s", name, surname);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, dateOfBirth);
    }
}

