package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishService;

public class WishController extends AbstractController {

	private WishService service;
	
	public void setService(WishService service) {
		this.service = service;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		

	//use service class b.logic
		String wmsg=service.generateWishMsg();
		
		//cteate and return ModelAndView obj
		
		return new ModelAndView("result","wresult",wmsg);
		
		
	}

}
