package spring.rest.api.controller;

import org.antlr.v4.runtime.atn.SemanticContext.AND;
import org.aspectj.weaver.patterns.IScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	
	@RequestMapping("/name")
	public String getProductName() {
		
		
		return "This is my product Controller";
		
	}
	
	@RequestMapping("/price")
	public int getProductPrice() {
		
		
		return 15000;
		
	}
	
	@RequestMapping("/print")
	public void getProductPrint() {
		
		
		System.out.println("Product is iphone 15");
	
	}
	
	//@RequestMapping(path="/delete", method = RequestMethod.DELETE)
	@DeleteMapping("/delete")
	public String getProductDelete() {
		
		
		return "product deleted";
		
		
		
	}
	
	
}
