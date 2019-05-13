/**
 * HomeController.java
 *
 * @author O. Kalu
 */
package edu.mum.cs.cs425.demowebapps.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String displayHomePage() {
    	System.out.println("ma loveeeeeeeeeeeeeeee");
        return "home/index";
    }

    @GetMapping(value = {"/about"})
    public String displayAboutPage() {
        return "home/about";
    }
}
