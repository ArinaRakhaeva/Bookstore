package fi.haagahelia.bookstore;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.haagahelia.bookstore.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@Autowired
	private CategoryRepository crepository;
	
	 @RequestMapping(value="/booklist")
	    public String bookList(Model model) {	
	        model.addAttribute("book", repository.findAll());
	        return "booklist";
	    }
	 
	@RequestMapping(value = "/add")
    public String addbook(Model model){
    	model.addAttribute("book", new Book());
        model.addAttribute("category", crepository.findAll());
        return "addbook";
    }     
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String save(Book book){
	        repository.save(book);
	        return "redirect:/booklist";
	    }    

	    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	    public String deleteBook(@PathVariable("id") Long Id, Model model) {
	    	repository.deleteById(Id);
	        return "redirect:../booklist";
	    }  
	    @RequestMapping(value = "/edit/{id}")
	    public String addStudent(@PathVariable("id") Long Id, Model model){
	    model.addAttribute("book", repository.findById(Id));
        model.addAttribute("category", crepository.findAll());
	    return "editbook";
	    }
}
