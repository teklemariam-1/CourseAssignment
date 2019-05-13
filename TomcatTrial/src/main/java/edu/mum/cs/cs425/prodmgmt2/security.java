package edu.mum.cs.cs425.prodmgmt2;

public class security {
	http.authorizeRequests()
	.antMatchers("/homePage").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
	.antMatchers("/userPage").access("hasRole('ROLE_USER')")
	.antMatchers("/adminPage").access("hasRole('ROLE_ADMIN')")
	.and()
		.formLogin().loginPage("/loginPage")
		.defaultSuccessUrl("/homePage")
		.failureUrl("/loginPage?error")
		.usernameParameter("username").passwordParameter("password")				
	.and()
		.logout().logoutSuccessUrl("/loginPage?logout"); 
}
