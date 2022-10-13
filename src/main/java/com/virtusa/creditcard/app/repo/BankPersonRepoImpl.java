package com.virtusa.creditcard.app.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.creditcard.app.config.entity.BankCustomerEnty;
import com.virtusa.creditcard.app.config.entity.Person;

@Repository
public class BankPersonRepoImpl extends BasePersonRepo {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Boolean createPerson(Person person) {
	
		Session session = sessionFactory.getCurrentSession();
		session.save(person);
		return true;
	
	}
	
	public List<Person> fetchAllPerson() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query qry = session.createQuery("from com.virtusa.creditcard.app.config.entity.Person",Person.class);
		
		return qry.list();
	
	}
	
	
}
