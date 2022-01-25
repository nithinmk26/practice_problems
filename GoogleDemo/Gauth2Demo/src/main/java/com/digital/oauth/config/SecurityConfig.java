package com.mindtree.oauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	 @Override
	    protected void configure(HttpSecurity http) throws Exception {

	 
//	           http.antMatcher("/add").authorizeRequests().antMatchers("/add").permitAll().anyRequest().authenticated().and()
//	           .oauth2Login().defaultSuccessUrl("/loginSuccess").failureUrl("/loginFailure");
//	           
	        
//	         for google login
	           http.authorizeRequests().anyRequest().authenticated().and()
	           .oauth2Login().defaultSuccessUrl("/loginSuccess").failureUrl("/loginFailure");

	 

	 

	}
	
}
