package com.ramakanth.service;




import org.springframework.stereotype.Service;




@Service
public class QuoteServiceImplementation implements QuoteService {

	public String getQuote() {
		/*String url="http://43.205.144.253:8080/ticket";
		RestTemplate rest=new RestTemplate();		
	ResponseEntity<String> responseentity=rest.postForEntity(url, Object obj, Ticket.class);
	Ticket body=responseentity.getBody();*/
		return "restTemp";
	}
	
	
}
