package com.sneha.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class ShopInfo {

	@WebMethod
	@WebResult(partName = "myOutput")
	public String getShopInfo(@WebParam(partName = "myInput")  String property) throws InvalidInputException {
		String response = "Invalid property";
		if("shopName".equals(property)) {
			response=  "Test Mart";
		}else if("since".equals(property)) {
			response = "since 2022";
		}else {
			throw new InvalidInputException("Invalid Input", property + " is not a valid input");
		}
		
		return response;
	}
}
