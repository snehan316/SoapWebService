package com.sneha.demo.business;

import java.util.ArrayList;
import java.util.List;

import com.sneha.demo.model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl() {
		bookList.add("Book1");
		bookList.add("Book2");
		bookList.add("Book3");
		
		musicList.add("music1");
		musicList.add("music2");
		musicList.add("music3");
		
		movieList.add("movie1");
		movieList.add("movie2");
		movieList.add("movie3");
	}
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product) {
		switch(category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}
	
	public List<Product> getProductsV2(String category){
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Book1","author1",999.00));
		productList.add(new Product("Book2","author2",1999.00));
		productList.add(new Product("Book3","author3",599.00));
		return productList;
	}
	
	
}
