package com.virtusa.creditcard.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.creditcard.app.config.entity.BankCustomerEnty;
import com.virtusa.creditcard.app.repo.BankCustomerRepoImpl;

@Service
@Transactional
public class BankCustomerManagerImpl implements BankCustomerManager {
	
	@Autowired
	private BankCustomerRepoImpl bankRepo;

	@Override
	public BankCustomerEnty create(BankCustomerEnty bnkEnty) {
		return bankRepo.createCustomer(bnkEnty);
	}

}
