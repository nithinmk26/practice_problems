package com.mindtree.google;

import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleController {

	 @GetMapping("/")
	    public String helloWorld() {
	        return "you don't need to be logged in";
	    }

	    @GetMapping("/not-restricted")
	    public String notRestricted() {
	        return "you don't need to be logged in";
	    }
	    

	    @GetMapping("/restricted")
	    public String restricted(@AuthenticationPrincipal OAuth2User oauth2User) {
	    	System.err.println(oauth2User);
	        return "if you see this you are logged in";
	    }

	
}
