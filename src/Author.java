import java.util.Objects;

public class Author {
    private final String name;
    private final String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass()) return false;
        return this.name.equals(((Author) o).name) && this.lastName.equals(((Author) o).lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.lastName);
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastName;
    }
}
