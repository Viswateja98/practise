package com.virtusa.creditcard.app.controller.vhelper;

import com.virtusa.creditcard.app.config.entity.BankCustomerEnty;
import com.virtusa.creditcard.app.model.BankCustomer;

public class BankCustomerViewHelper {

	private static BankCustomerViewHelper bankCustomerViewHelper = null;
	
	private BankCustomerViewHelper() {
		//nothing
	}
	
	public static BankCustomerViewHelper getInstance() {
		if (bankCustomerViewHelper == null) {
			bankCustomerViewHelper = new BankCustomerViewHelper();
		}
		return bankCustomerViewHelper;
	}
	
	public BankCustomerEnty convertBankCustomerModel2Entity(BankCustomer bCust) {
		BankCustomerEnty enty = new BankCustomerEnty();
		enty.setEmail(bCust.getEmail());
		enty.setFirstName(bCust.getFirstName());
		enty.setLastName(bCust.getLastName());
		
		return enty;
	}
	
	public BankCustomer convertBankCustomerEntytoViewModel(BankCustomerEnty enty) {
		BankCustomer bcust = new BankCustomer();
		bcust.setEmail(enty.getEmail());
		bcust.setFirstName(enty.getFirstName());
		bcust.setLastName(enty.getLastName());
		bcust.setId(enty.getId());
		
		return bcust;
		
	}
}
