package com.SDEadda247.Subjects.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SDEadda247.Subjects.entity.entity;
import com.SDEadda247.Subjects.service.service;

@RestController
@RequestMapping("/subject")
public class controller {
	@Autowired
	private service productservice;
	
	@PostMapping("/addsubject")
	public entity addProduct(@RequestBody entity product)
	{
		return productservice.SaveProduct(product);
	}
	
	@PostMapping("/addsubjects")
	public List<entity> addProducts(@RequestBody List<entity> products)
	{
		return productservice.SaveProducts(products);
	}
	
	
	@GetMapping("/showsubjects")
	public List<entity> findall()
	{
		return productservice.GetAll();
	}
	
	@GetMapping("/subjectByID/{id}")
	public entity getbyid(@PathVariable int id)
	{
		return productservice.GetByID(id);
	}
	
	@GetMapping("/subjectByName/{name}")
	public entity getbyname(@PathVariable String name)
	{
		return productservice.GetBysubjectname(name); 
	}
	
	@PutMapping("/subject/{id}")
	public entity updateProduct(@RequestBody entity product,@PathVariable int id)
	{
		return productservice.Update(product,id);
	}
	@DeleteMapping("/deletesubject/{id}")
	public String deletebyid(@PathVariable int id)
	{
		return productservice.DeleteByID(id);
		
	}

}
