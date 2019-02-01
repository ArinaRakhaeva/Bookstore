package fi.haagahelia.bookstore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@org.springframework.web.bind.annotation.RestController
public class BookController {
    ArrayList<Book> books;

    BookController(){}

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String hello() {
        return "Nothing";
    }
}
