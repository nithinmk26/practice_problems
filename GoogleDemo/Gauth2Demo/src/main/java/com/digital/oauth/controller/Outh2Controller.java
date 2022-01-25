package com.mindtree.oauth.controller;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mindtree.oauth.dto.UserDto;

@RestController
public class Outh2Controller {

	
    
	  private static final String authorizationRequestBaseUri = "oauth2/authorize-client";
	    Map<String, String> oauth2AuthenticationUrls = new HashMap<>();
	    private String  loggedInUserEmail;
	    @Autowired
	    private ClientRegistrationRepository clientRegistrationRepository;
	    @Autowired
	    private OAuth2AuthorizedClientService authorizedClientService;



	    @GetMapping("/loginSuccess")
	    public void getLoginInfo(Model model, OAuth2AuthenticationToken authentication) throws ServiceException {


	        OAuth2AuthorizedClient client = authorizedClientService.loadAuthorizedClient(authentication.getAuthorizedClientRegistrationId(), authentication.getName());


	        String userInfoEndpointUri = client.getClientRegistration()
	            .getProviderDetails()
	            .getUserInfoEndpoint()
	            .getUri();


	        if (!StringUtils.isEmpty(userInfoEndpointUri)) {
	            RestTemplate restTemplate = new RestTemplate();
	            HttpHeaders headers = new HttpHeaders();
	            headers.add(HttpHeaders.AUTHORIZATION, "Bearer " + client.getAccessToken()
	                .getTokenValue());


	            HttpEntity<String> entity = new HttpEntity<String>("", headers);
	           
	            ResponseEntity<Map> response = restTemplate.exchange(userInfoEndpointUri, HttpMethod.GET, entity, Map.class);
	            Map userAttributes = response.getBody();
	            model.addAttribute("name", userAttributes.get("name"));
	            loggedInUserEmail=(String) response.getBody().get("email");
	            
	            System.err.println(response.getBody());
//	            response.getBody().get(key);
	            System.out.println(loggedInUserEmail);
//	           UserDto userDTO= userService.setLoginDetails(loggedInUserEmail);
//	           return "";
	        }
//	        return null;
	       
	    }
	 








	
}
