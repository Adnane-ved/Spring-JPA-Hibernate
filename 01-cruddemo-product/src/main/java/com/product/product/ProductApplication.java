package com.product.product;

import com.product.product.dao.Productdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Bean
	public CommandLineRunner cmdrunner(Productdao productdao) {
		return runner -> {
			//createproduct(productdao);
			//retrieveById(productdao);
			//retrieveAll(productdao);
			//retrieveByLastName(productdao);
			//updateById(productdao);
			modifyByLastName(productdao);
		};
	}

	public void createproduct(Productdao productdao) {
		// create product
		System.out.println("create product");
		Products product = new Products("oreo",6.0f,2);

		// save product
		System.out.println("save product");
		productdao.save(product);


	}

	public void retrieveById(Productdao productdao) {

		Products product = productdao.findById(2);
		System.out.println(product);
	}

	public void retrieveAll(Productdao prodactdao){
		List<Products> products = prodactdao.findAll();
		for(Products product : products){
			System.out.println(product);
		}
	}

	public void retrieveByLastName(Productdao productdao){

		for(Products product : productdao.findByLastName("bimo") ){
			System.out.println(product);
		}
	}

	public void updateById(Productdao productdao){
		Products product = productdao.findById(2);
		product.setName("merendina");
		productdao.update(product);
	}

	public void modifyByLastName(Productdao productdao){
		productdao.updateByLastName("oreo");
	}


}
