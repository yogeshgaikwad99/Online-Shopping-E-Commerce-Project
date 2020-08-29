package com.ecommerce.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.ecommerce.app.model.Products;


public class ProductsMapper implements ResultSetMapper<Products> {

	@Override
	public Products map(int index, ResultSet r, StatementContext ctx) throws SQLException {
		
		return new Products(r.getInt("id"), r.getString("category"), r.getString("company"), r.getString("product"), r.getString("color"),
				 r.getInt("price"), r.getDate("addedDate"));
	}

}