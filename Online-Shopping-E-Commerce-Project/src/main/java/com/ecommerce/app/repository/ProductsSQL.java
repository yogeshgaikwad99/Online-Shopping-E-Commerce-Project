package com.ecommerce.app.repository;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import com.ecommerce.app.model.Products;

@RegisterMapper(value = ProductsMapper.class)
public interface ProductsSQL {

		@SqlQuery("Select * from Products_TB")
		public List<Products> getProducts();

		@SqlUpdate("insert into Products_TB (category,company,product,color,price,addedDate)"
				+ "value(:category,:company,:product,:color,:price,:addedDate)")
		@GetGeneratedKeys
		public Integer addProduct(@BindBean Products product);

		@SqlQuery("SELECT * FROM Products_TB WHERE price = :price")
		abstract List<Products> getProductByPrice(@Bind("price") int price);

}