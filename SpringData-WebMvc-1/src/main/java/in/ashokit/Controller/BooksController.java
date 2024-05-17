package in.ashokit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.Entity.Books;
import in.ashokit.Repo.BooksRepo;

@Controller
public class BooksController {
	@Autowired
	private BooksRepo bsrep;
	
	public BooksController(BooksRepo bsrep) {
		super();
		this.bsrep = bsrep;
	}

	@GetMapping("/index")
	public ModelAndView getwel() {
		ModelAndView mav= new ModelAndView();
		List<Books>list=bsrep.findAll();
		mav.addObject("msg",list);
		mav.setViewName("index");
		
		return mav;
	}
	

}
