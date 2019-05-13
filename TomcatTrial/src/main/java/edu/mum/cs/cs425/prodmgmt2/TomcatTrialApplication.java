package edu.mum.cs.cs425.prodmgmt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TomcatTrialApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(TomcatTrialApplication.class, args);
	}
//	  @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
//    	
//    	return app.sources(SpringApplicationBuilder.class);
//    }
}
