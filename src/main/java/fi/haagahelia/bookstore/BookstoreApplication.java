package fi.haagahelia.bookstore;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import fi.haagahelia.bookstore.Book;
import fi.haagahelia.bookstore.BookRepository;

@SpringBootApplication
public class BookstoreApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(BookRepository repository, CategoryRepository crepository) {
		return (args) -> {
			
			crepository.save(new Category("Художественная"));
			crepository.save(new Category("Право"));
			crepository.save(new Category("IT"));
			
			repository.save(new Book("Три мушкетера","Дюма",1919,234667,34, crepository.findByName("IT").get(0)));
			repository.save(new Book("Маленький принц","Экзюпери",1987,233667,15, crepository.findByName("Право").get(0)));
    	
		};
	}
}

