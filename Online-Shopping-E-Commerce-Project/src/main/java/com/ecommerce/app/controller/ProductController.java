package com.ecommerce.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.app.model.Products;
import com.ecommerce.app.repository.ProductsRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
		@Autowired
		private ProductsRepository repository;

		@PostMapping("/addProduct")
		public String addProduct(@RequestBody Products product) {
			Integer count = repository.addProduct(product);
			return count + " record saved...";
		}

		@GetMapping("/getProduts")
		public List<Products> getProducts() {
			return repository.findAllProduct();
		}

		@GetMapping("/getProducts/{price}")
		public List<Products> getProdutsByPrice(@PathVariable int price) {
			return repository.getProductByPrice(price);
		}
	
}
