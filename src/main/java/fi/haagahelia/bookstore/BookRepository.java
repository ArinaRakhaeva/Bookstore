package fi.haagahelia.bookstore;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//public interface BookRepository extends CrudRepository<Book,Long> {
	//List<Book> findBytitle(String title);
//}
@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book, Long> {
List<Book> findByTitle(@Param("title") String title);
}