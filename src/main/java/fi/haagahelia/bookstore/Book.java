package fi.haagahelia.bookstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;





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
    
    @ManyToOne
    @JoinColumn(name = "categoryid")
    private Category category;
   
    public Book() {}	
     
public Book(String title, String author, Integer year, Integer isbn, Integer price, Category category) {
	super();
	
	this.title = title;
	this.author = author;
	this.year = year;
	this.isbn = isbn;
	this.price = price;
	this.category = category;
}


public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
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
	if (this.category != null)
		return "Student [id=" + id + ", title=" + title+ ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price + " category =" + this.getCategory() + "]";		
	else
    	return "Book [id=" + id + ", title=" + title+ ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price + "]";
}
}
	

    
