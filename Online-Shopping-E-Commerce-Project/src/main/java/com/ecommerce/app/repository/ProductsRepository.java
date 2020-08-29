package com.ecommerce.app.repository;

import java.sql.Connection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import com.ecommerce.app.model.Products;

@Repository
public class ProductsRepository {

		@Autowired
		@Qualifier("dataSource")
		private DataSource dataSource;

		Connection connection = null;
		Handle handle = null;
		ProductsSQL productSQL = null;

		@PostConstruct
		public void init() {
			connection = DataSourceUtils.getConnection(dataSource);
		
			handle = DBI.open(connection);
			productSQL = handle.attach(ProductsSQL.class);
		}

		public List<Products> findAllProduct() {
			return productSQL.getProducts();
		}

		public Integer addProduct(Products product) {
			return productSQL.addProduct(product);
		}

		public List<Products> getProductByPrice(int price) {
			return productSQL.getProductByPrice(price);
		}

}