package edu.mum.cs.cs425.demowebapps.elibrary.controller;

import edu.mum.cs.cs425.demowebapps.elibrary.model.Book;
import edu.mum.cs.cs425.demowebapps.elibrary.service.BookService;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //@RequestMapping(value = "/elibrary/books", method = RequestMethod.GET)
    @GetMapping(value = "/elibrary/book/list")
    public ModelAndView listBooks() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("books", bookService.getBooks());
        mav.setViewName("book/list");
        return mav;
    }
      // creating new book
    @RequestMapping(value="/elibrary/book/create", method = RequestMethod.GET)
	public String create(Model model){			
		model.addAttribute("book", new Book());
		return "book/edit";
	}
	  // saving edited book
	@RequestMapping(value = "/elibrary/book/save", method = RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("book") Book book, 
			BindingResult result, Model model)  {

		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			return "book/edit";
		}
		book = bookService.save(book);
		return "redirect:/elibrary/book/list";
	}	
	   //getting a book for editing
	@RequestMapping(value="/elibrary/book/{bookid}", method = RequestMethod.GET)
	public String view(@PathVariable Long bookid, Model model){	
		model.addAttribute("book", bookService.findOne(bookid));
		//System.out.println("tekkkkkkkkkkkkkkkkkkkkkkk");
		return "book/edit";
	}
	   // deleting a book
	@RequestMapping(value="/elibrary/book/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable Long id, Model model){		
		bookService.delete(id);
		
		
		return "redirect:/elibrary/book/list";
	}	
}
