package fi.haagahelia.bookstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
    private String title; 
    private String author;
    private Integer year;
    private Integer isbn;
    private Integer price;
    
    public Book() {}	
     
public Book(String title, String author, Integer year, Integer isbn, Integer price) {
	super();
	
	this.title = title;
	this.author = author;
	this.year = year;
	this.isbn = isbn;
	this.price = price;
}


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Integer getYear() {
	return year;
}
public void setYear(Integer year) {
	this.year = year;
}
public Integer getIsbn() {
	return isbn;
}
public void setIsbn(Integer isbn) {
	this.isbn = isbn;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}
@Override
public String toString() {
    		return "Book [id=" + id + ", title=" + title+ ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price + "]";
}
}
	

    
