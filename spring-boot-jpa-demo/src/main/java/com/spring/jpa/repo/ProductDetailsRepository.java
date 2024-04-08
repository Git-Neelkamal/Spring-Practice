package com.spring.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.entity.ProductDetails;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails,Integer > {

}
