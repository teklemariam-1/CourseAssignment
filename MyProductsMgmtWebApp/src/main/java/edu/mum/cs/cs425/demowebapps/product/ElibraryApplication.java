package edu.mum.cs.cs425.demowebapps.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//public class ElibraryApplication extends SpringBootServletInitializer{
//
//    public static void main(String[] args) {
//        SpringApplication.run(ElibraryApplication.class, args);
//    }
//    
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
//    	
//    	return app.sources(SpringApplicationBuilder.class);
//    }
//
//}


@SpringBootApplication
@ComponentScan("edu.mum.cs.cs425.demowebapps.product")
public class ElibraryApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
      SpringApplication.run(ElibraryApplication.class, args);
  }
  
 
}