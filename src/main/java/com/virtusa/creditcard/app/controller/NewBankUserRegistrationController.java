package com.virtusa.creditcard.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.creditcard.app.config.entity.BankCustomerEnty;
import com.virtusa.creditcard.app.controller.vhelper.BankCustomerViewHelper;
import com.virtusa.creditcard.app.model.BankCustomer;
import com.virtusa.creditcard.app.service.BankCustomerManager;

@Controller
public class NewBankUserRegistrationController extends BaseController {
	
	@Autowired
	private BankCustomerManager bankService;

	@GetMapping({"/bankregister"})
	public ModelAndView initview() {
		
		ModelAndView mav = new ModelAndView("newcustomer");
		
		mav.addObject("bankcustomer", new BankCustomer());
		
		return mav;
		
	}
	
	@PostMapping({"addCustomer"})
	public ModelAndView handleSubmit(@ModelAttribute("bankcustomer") BankCustomer bankCust) {
		ModelAndView mav = new ModelAndView("summary");
		
		BankCustomerEnty enty = BankCustomerViewHelper.getInstance().convertBankCustomerModel2Entity(bankCust);
		enty = bankService.create(enty);
		
		BankCustomer bCust = BankCustomerViewHelper.getInstance().convertBankCustomerEntytoViewModel(enty);
		
		System.out.println(bCust);
		
	
		mav.addObject("bankid", bCust.getId());
		mav.addObject("status", "Sucess");
		
		System.out.println(bCust.toString());
		
		return mav;
	}
	
	
}
