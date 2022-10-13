package com.virtusa.creditcard.app.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.creditcard.app.config.entity.BankCustomerEnty;

@Repository
public class BankCustomerRepoImpl extends BaseCustomerRepo {

	@Autowired
	private SessionFactory sessionFactory;
	
	public BankCustomerEnty createCustomer(BankCustomerEnty bnkEnty) {
	
		Session session = sessionFactory.getCurrentSession();
		session.save(bnkEnty);
		
		Query qry = session.createQuery("from BankCustomerEnty where id=:idy");
		qry.setInteger("idy", (int) bnkEnty.getId());
		
		return (BankCustomerEnty) qry.getSingleResult();
		
	
	}
	
}
