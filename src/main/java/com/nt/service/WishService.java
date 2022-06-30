package com.nt.service;

import java.util.Calendar;

public class WishService {
	
	public String generateWishMsg() {
	//get system date and  time
	
	Calendar cl=Calendar.getInstance();
	
	//get current hour of the day
	int h=cl.get(Calendar.HOUR_OF_DAY);
	
	String msg=null;
	
	if(h<=12)
		msg="Good Morning..";
	else if(h<=16)
		msg="Good Afternoon";
	else if(h<=20)
		msg="Good Evening..";
	else 
		msg="Good Night..";
	return msg;

}

}