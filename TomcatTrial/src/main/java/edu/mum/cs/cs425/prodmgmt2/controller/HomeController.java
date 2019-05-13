/**
 * HomeController.java
 *
 * @author O. Kalu
 */
package edu.mum.cs.cs425.prodmgmt2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String displayHomePage() {
    	
        return "home/index";
    }

  
}
