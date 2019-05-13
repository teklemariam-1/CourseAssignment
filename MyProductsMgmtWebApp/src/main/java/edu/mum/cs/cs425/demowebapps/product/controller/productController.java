package edu.mum.cs.cs425.demowebapps.product.controller;

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

import edu.mum.cs.cs425.demowebapps.product.model.Product;
import edu.mum.cs.cs425.demowebapps.product.service.ProductService;

@Controller
public class productController {

    @Autowired
    private ProductService productService;

    //@RequestMapping(value = "/elibrary/products", method = RequestMethod.GET)
    @GetMapping(value = "/product/list")
    public ModelAndView listproducts() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("products", productService.getProducts());
        mav.setViewName("product/list");
        return mav;
    }
      // creating new product
    @RequestMapping(value="/product/create", method = RequestMethod.GET)
	public String create(Model model){			
		model.addAttribute("product", new Product());
		return "product/edit";
	}
	  // saving edited product
	@RequestMapping(value = "/product/save", method = RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("product") Product product, 
			BindingResult result, Model model)  {

		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			return "product/edit";
		}
		product = productService.save(product);
		return "redirect:/product/list";
	}	
	   //getting a product for editing
	@RequestMapping(value="/product/{pid}", method = RequestMethod.GET)
	public String view(@PathVariable Long pid, Model model){	
		model.addAttribute("product", productService.findOne(pid));
		
		return "product/edit";
	}
	   // deleting a product
	@RequestMapping(value="/product/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable Long id, Model model){		
		productService.delete(id);
		
		
		return "redirect:/product/list";
	}	
}
