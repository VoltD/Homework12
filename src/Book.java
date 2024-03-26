import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int yearOfPublishing;

    public Book(String name, Author author, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book(String name, Author author) {
        this(name, author, 0);
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass()) return false;
        return this.name.equals(((Book) o).name) && this.author.equals(((Book) o).author) && this.yearOfPublishing == ((Book) o).yearOfPublishing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.author, this.yearOfPublishing);
    }

    @Override
    public String toString() {
        return this.name + " " + this.author.toString() + " " + this.yearOfPublishing;
    }
}
