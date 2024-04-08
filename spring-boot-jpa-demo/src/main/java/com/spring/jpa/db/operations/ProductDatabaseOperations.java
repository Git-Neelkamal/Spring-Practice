package com.spring.jpa.db.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.jpa.entity.ProductDetails;
import com.spring.jpa.repo.ProductDetailsRepository;

@Component
public class ProductDatabaseOperations {
	
	
	
	@Autowired
	ProductDetailsRepository repository;
	
	public void addProductData() {
		
		ProductDetails details=new ProductDetails();
		details.setProductId(666);
		details.setProductName(" Watch");
		details.setProductPrice(50000);
		
	repository.save(details);
		
		
	}
	
	
	
	public void deleteProductData() {
		
		repository.deleteById(8888);;
		
	}
	
	
	
	public void deleteAllProduct() {
		
		repository.deleteAll();
		
	}
	
	
	
	public void loadDataByPid() {
		
	Optional<ProductDetails> data=	repository.findById(666);
		
	ProductDetails product = data.get();
	System.out.println(product.getProductId());
	System.out.println(product.getProductName());
	System.out.println(product.getProductPrice());
	}
	
	
	
	public void addMoreProducts() {
		
		ProductDetails p1=new ProductDetails();
		p1.setProductId(123);
		p1.setProductName("mouse");
		p1.setProductPrice(455);
		
		
		ProductDetails p2=new ProductDetails();
		p2.setProductId(124);
		p2.setProductName("ljnsd");
		p2.setProductPrice(455);
		
		ProductDetails p3=new ProductDetails();
		p3.setProductId(128);
		p3.setProductName("dzsd");
		p3.setProductPrice(455);
		
		ProductDetails p4=new ProductDetails();
		p4.setProductId(4889);
		p4.setProductName("asdva");
		p4.setProductPrice(455);
		
		ProductDetails p5=new ProductDetails();
		p5.setProductId(899);
		p5.setProductName("fadsdgv");
		p5.setProductPrice(455);
		
		
		List<ProductDetails> moreDetails=new ArrayList<>();
		moreDetails.add(p5);
		moreDetails.add(p4);
		moreDetails.add(p3);
		moreDetails.add(p2);
		moreDetails.add(p1);
		
		repository.saveAll(moreDetails);
	}
	
	public void loadAllProducts() {
		

		List<ProductDetails> allProducts= repository.findAll();
		
		for(ProductDetails P: allProducts) {
			
			System.out.println(P);
		}
		
		
	}
	
	
	
	
	
	
	

}
