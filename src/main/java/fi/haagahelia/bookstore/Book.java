package fi.haagahelia.bookstore;

public class Book {
    private String title;
    private String author;
    private Integer year;
    private Boolean isbn;
    private Integer price;

    Book(String title, String author, Integer year, Boolean isbn, Integer price){
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + title + ", " + author + ", " + year + ", " + isbn + ", " + price + "]";
    }
}
