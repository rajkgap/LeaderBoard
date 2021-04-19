package com.SDEadda247.Students.controller;

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

import com.SDEadda247.Students.entity.entity;
import com.SDEadda247.Students.service.service;


@RestController
@RequestMapping("/student")
public class controller {
	
	@Autowired
	private service productservice;
	
	@PostMapping("/addstudent")
	public entity addProduct(@RequestBody entity product)
	{
		return productservice.SaveProduct(product);
	}
	
	@PostMapping("/addstudents")
	public List<entity> addProducts(@RequestBody List<entity> products)
	{
		return productservice.SaveProducts(products);
	}
	
	
	@GetMapping("/showstudents")
	public List<entity> findall()
	{
		return productservice.GetAll();
	}
	
	@GetMapping("/studentByID/{id}")
	public entity getbyid(@PathVariable int id)
	{
		return productservice.GetByID(id);
	}
	
	@GetMapping("/studentByName/{name}")
	public entity getbyname(@PathVariable String name)
	{
		return productservice.GetByname(name); 
	}
	
	@PutMapping("/student/{id}")
	public entity updateProduct(@RequestBody entity product,@PathVariable int id)
	{
		return productservice.Update(product,id);
	}
	@DeleteMapping("/deletestudent/{id}")
	public String deletebyid(@PathVariable int id)
	{
		return productservice.DeleteByID(id);
		
	}

}
