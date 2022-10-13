package com.virtusa.creditcard.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.creditcard.app.config.entity.Eraser;
import com.virtusa.creditcard.app.config.entity.MyPerson;
import com.virtusa.creditcard.app.config.entity.Pen;
import com.virtusa.creditcard.app.config.entity.Pencil;
import com.virtusa.creditcard.app.config.entity.YourPerson;
import com.virtusa.creditcard.app.service.BankPersonManager;

@Controller
public class MyNewController extends BaseController {
	
	@Autowired
	private BankPersonManager bpService;

	@GetMapping({"/"})
	public String loadIndex(Model mdl) {
		mdl.addAttribute("name", "Welcome to Virtusa1");
		return "index";
	}
	
	@GetMapping({"/test"})
	public ModelAndView loadNewIndex() {
		ModelAndView mav = new ModelAndView("index");
		//mav.setViewName("index");
		mav.addObject("name", "Welcome to Virtusa2");
		
		return mav;
	}
	
	@GetMapping({"/msc"})
	public ModelAndView savemsp() {
		
		MyPerson mp = new MyPerson();
		mp.setAdhaarNum("1232445654545454");
		mp.setAge(45);
		mp.setCountry("IN");
		mp.setName("Kabali");
		
		MyPerson mp2 = new MyPerson();
		mp2.setAdhaarNum("1343432445654545454");
		mp2.setAge(55);
		mp2.setCountry("SG");
		mp2.setName("Kala");
		
		YourPerson yp = new YourPerson();
		yp.setAge(35);
		yp.setName("Billa");
		yp.setSsn("64656565");
		
		bpService.createPerson(mp);
		bpService.createPerson(mp2);
		bpService.createPerson(yp);
		
		System.out.println("===================================");
		
		System.out.println(bpService.fetchAllPerson());
		
		ModelAndView mav = new ModelAndView("index");
		//mav.setViewName("index");
		mav.addObject("name", "Welcome to Virtusa2");
		
		return mav;
	}
	
	
	@GetMapping({"/st"})
	public ModelAndView savest() {
		
		Pen pen = new Pen();
		pen.setCost(45);
		pen.setInkColor("blue");
		pen.setIsGel(true);
		pen.setName("Reynolds");
		
		Eraser ers = new Eraser();
		ers.setCost(5);
		ers.setEraserType("natural rubber");
		ers.setName("camlin");
		ers.setWeight(3);
		
		Pencil pencil= new Pencil();
		pencil.setCost(10);
		pencil.setManuf("Nataraj");
		pencil.setName("HB-2");
		pencil.setPenType("SchoolType");
		
		
		Pen pen22 = new Pen();
		pen22.setCost(25);
		pen22.setInkColor("Red");
		pen22.setIsGel(true);
		pen22.setName("Camlin");
		
		
		bpService.createProducts(pencil);
		bpService.createProducts(ers);
		bpService.createProducts(pen);
		bpService.createProducts(pen22);
		
		System.out.println("===================================");
		
	
		ModelAndView mav = new ModelAndView("index");
		//mav.setViewName("index");
		mav.addObject("name", "Welcome to Virtusa2");
		mav.addObject("data", bpService.fetchAllProducts());
		
		return mav;
	}
	
	
	
}
