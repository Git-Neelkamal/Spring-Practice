package com.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.jpa.db.operations.ProductDatabaseOperations;

@SpringBootApplication
public class SpringBootJpaDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context= SpringApplication.run(SpringBootJpaDemoApplication.class, args);
		
		ProductDatabaseOperations ops =context.getBean(ProductDatabaseOperations.class);
			
		//ops.addProductData();
		//ops.deleteProductData();

		//ops.loadDataByPid();
	
		ops.addMoreProducts();
		 
		//ops.loadAllProducts();
	
	}

}
