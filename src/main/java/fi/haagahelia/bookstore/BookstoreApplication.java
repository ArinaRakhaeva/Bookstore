package fi.haagahelia.bookstore;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.bookstore.Category;
import fi.haagahelia.bookstore.CategoryRepository;
import fi.haagahelia.bookstore.Book;
import fi.haagahelia.bookstore.BookRepository;
import fi.haagahelia.bookstore.User;
import fi.haagahelia.bookstore.UserRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository crepository, UserRepository urepository) {
		return (args) -> {
			log.info("save a couple of books");
			crepository.save(new Category("Drama"));
			crepository.save(new Category("Law"));
			crepository.save(new Category("IT"));
			
			repository.save(new Book("Handmade's Tales","Duma",1919,234667,34, crepository.findByName("IT").get(0)));
			repository.save(new Book("A little prince","Eczuperi",1987,233667,15, crepository.findByName("Law").get(0)));
			
			// Create users: admin/admin user/user
			User user1 = new User("user", "$2a$10$XIjxGLDIw3gIT2jBviGB0.FIUwpbvQKU.g5wXAkPTkA/QjZS6zlpq", "USER");
			User user2 = new User("admin", "$2a$10$AhxTY7sngNMrykd..siZZeDqTPRVBCwrT76m.a7qdunEsOfaDWsEO", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
			
			log.info("fetch all books");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}
}

