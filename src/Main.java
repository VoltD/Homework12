public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lev", "Tolstoy");
        Author author2 = new Author("Stephen", "King");
        Book book1 = new Book("War and peace", author1, 2020);
        Book book2 = new Book("Carrie", author2);
        book2.setYearOfPublishing(2024);
    }
}