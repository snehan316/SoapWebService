package com.sneha.demo;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.sneha.demo.business.ProductServiceImpl;
import com.sneha.demo.model.Product;

@WebService(name = "TestMartCatalog", serviceName = "TestMartCatalogService", portName = "TestMartCatalogPort", targetNamespace = "http://www.testmart.com")
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	
	}
	
	@WebMethod
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	@WebMethod
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
	@WebMethod
	@WebResult(name="Product")
	public List<Product> getProductsV2(String category){
		return productService.getProductsV2(category);
	}
}

