package com.virtusa.creditcard.app.service;

import java.util.List;

import com.virtusa.creditcard.app.config.entity.Person;
import com.virtusa.creditcard.app.config.entity.Product;

public interface BankPersonManager {
	public Boolean createPerson(Person person);
	public List<Person> fetchAllPerson();
	
	public Boolean createProducts(Product prod);
	
	public List<Product> fetchAllProducts();
}
