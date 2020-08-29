package com.ecommerce.app.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Products {

	private int id;
	private String category;
	private String company;
	private String product;
	private String color;
	private int price;
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING, timezone = "Asia/Kolkata")
	private Date addedDate;
	
	public Products() {
		super();
	}

	public Products(int id, String category, String company, String product, String color, int price, Date addedDate) {
		super();
		this.id = id;
		this.category = category;
		this.company = company;
		this.product = product;
		this.color = color;
		this.price = price;
		this.addedDate = addedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
}
