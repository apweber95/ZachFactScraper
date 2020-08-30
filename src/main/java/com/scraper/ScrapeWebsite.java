package com.scraper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.scraper.model.Fact;
import com.scraper.service.FactService;

@Component
public class ScrapeWebsite {
	
	@Autowired
	FactService factService;
	
	public void getWebpageElments() {
		
		WebClient client = new WebClient();
		client.getOptions().setThrowExceptionOnFailingStatusCode(false);
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
		try {
			
			String searchUrl = "https://www.snapple.com/real-facts"; 
			HtmlPage page = client.getPage(searchUrl);		
			DomElement domElement =  page.getElementById("fact-list");

			for(DomNode node: domElement.getChildren()) {
				Fact fact = new Fact();
				fact.setZachFact(node.asText());
				fact.setFactUsed(false);
				factService.saveOrUpdate(fact);
			}		
			
		}catch(Exception e){
		  e.printStackTrace();
		}
		
	}

}
