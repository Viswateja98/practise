package com.virtusa.creditcard.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.creditcard.app.config.entity.Person;
import com.virtusa.creditcard.app.config.entity.Product;
import com.virtusa.creditcard.app.repo.BankPersonRepoImpl;
import com.virtusa.creditcard.app.repo.BankProductRepoImpl;

@Service
@Transactional
public class BankPersonManagerImpl implements BankPersonManager {
	
	@Autowired
	private BankPersonRepoImpl repo;
	
	@Autowired
	private BankProductRepoImpl prodRepo;

	@Override
	public Boolean createPerson(Person person) {
		return repo.createPerson(person);
	}

	@Override
	public List<Person> fetchAllPerson() {
		return repo.fetchAllPerson();
	}

	@Override
	public Boolean createProducts(Product prod) {
		// TODO Auto-generated method stub
		return prodRepo.createProducts(prod);
	}

	@Override
	public List<Product> fetchAllProducts() {
		// TODO Auto-generated method stub
		return prodRepo.fetchAllProducts();
	}

}
