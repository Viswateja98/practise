package com.virtusa.creditcard.app.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.creditcard.app.config.entity.Person;
import com.virtusa.creditcard.app.config.entity.Product;

@Repository
public class BankProductRepoImpl {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Boolean createProducts(Product prod) {
	
		Session session = sessionFactory.getCurrentSession();
		session.save(prod);
		return true;
	
	}
	
	public List<Product> fetchAllProducts() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query qry = session.createQuery("from Product",Product.class);
		
		return qry.list();
	
	}
}
