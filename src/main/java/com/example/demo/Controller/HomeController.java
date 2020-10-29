package com.example.demo.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;

import java.util.*;
@RestController
@RequestMapping("/controller")
public class HomeController {

	
	
	@RequestMapping("/getAllData")
	public ArrayList<User> getAllData() {
			return service.getAllUsers();
	}
	
	@RequestMapping("/saveData")
	public ArrayList<String> saveData(@RequestBody User user) {
		ArrayList<String> map=new ArrayList<>();
		//System.out.println(user.getComId()+" "+user.getComName()+" "+user.getEmp());
		if(user==null||user.getComId()==null) {
			map.add("Something went wrong");
			return map;
		}
		else {
			service.save(user);
			map.add("Data has been saved successfully");
			return map;
		}
		
		//System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	@Autowired
	UserService service;
	
//	@RequestMapping("/")
//	public String home() {
//		return "NewFile.html";
//	}
//	@RequestMapping("/addForm")
//	public String addForm() {
//		return "addForm";
//	}
//	
//	@RequestMapping("/searchForm")
//	public String searchForm() {
//		return "searchForm";
//	}
//	
//	@RequestMapping("/add")
//	public ModelAndView add(User user) {
//		ModelAndView mv=new ModelAndView();
//		service.save(user);
//		mv.setViewName("addForm");
//		return mv;
//	}
//	
//	@RequestMapping("/search")
//	public ModelAndView search(HttpServletRequest req) {
//		String comId=req.getParameter("comId");
//		//System.out.println(comId);
//		ModelAndView mv=new ModelAndView();
//		User user=service.findByComId(comId);
//		mv.addObject(user);
//		mv.setViewName("output");
//		return mv;
//	}
}
