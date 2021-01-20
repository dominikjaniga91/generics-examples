package generic.methods;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

class Grade implements Comparable<Grade> {

    private final long id;
    private final String title;
    private final LocalDate dateOfIssuance;

    public Grade(long id, String title, LocalDate dateOfIssuance) {
        this.id = id;
        this.title = title;
        this.dateOfIssuance = dateOfIssuance;
    }

    @Override
    public int compareTo(Grade grade) {
        return Long.compare(this.id, grade.id);
    }

    List<Grade> getListOfGrades() {
        return List.of(new Grade(1, "Doctor", LocalDate.now()),
                       new Grade(2, "Engineer", LocalDate.now()),
                       new Grade(3, "Professor", LocalDate.now()),
                       new Grade(4, "Vim expert", LocalDate.now()));
    }

    @Override
    public String toString() {
        return String.format("Title: %s", title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return id == grade.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, dateOfIssuance);
    }
}

