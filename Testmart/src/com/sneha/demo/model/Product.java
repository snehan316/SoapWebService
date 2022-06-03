package com.sneha.demo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"price","name","author"}) //order which xml is created
public class Product {

	private String name;
	private String author;
	private double price;
	
	public Product(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Product() {
		
	}

	@XmlElement(name = "ProductName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
