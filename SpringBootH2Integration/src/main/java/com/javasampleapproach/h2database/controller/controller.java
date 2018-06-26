package com.javasampleapproach.h2database.controller;

import java.io.IOException;


import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javasampleapproach.h2database.model.Customer;
import com.javasampleapproach.h2database.repository.CustomerRepository;




@Controller
public class controller  {
  @Autowired
   CustomerRepository userService;

	
	    @RequestMapping("/user")
	    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

	    	 PrintWriter pw= res.getWriter();
	    	 res.setContentType("text/html/xml");
	    	
	    	 userService.save(new Customer("sana","saran"));
		    	userService.save(new Customer("sana","saran"));
	    	 pw.println(userService.findAll());
	    }
 
	    @RequestMapping("/home")  
	    public ModelAndView viewemp(){  
	        //write the code to get all employees from DAO  
	        //here, we are writing manual code of list for easy understanding  
	        List<Customer> list=new ArrayList<Customer>();  
	        Iterable<Customer> t = userService.findAll();
	  	
	  		    if(t != null) {
	  	      for(Customer e: t) {
	  	        list.add(e);
	  	      }
	  	    }
	        return new ModelAndView("home","list",list);  
	    }  

}


  