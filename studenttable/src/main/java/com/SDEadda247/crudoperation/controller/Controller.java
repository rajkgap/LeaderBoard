package com.SDEadda247.crudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SDEadda247.crudoperation.entity.entity;
import com.SDEadda247.crudoperation.service.Service;

@RestController
public class Controller {
	@Autowired
	private Service productservice;
	
	@PostMapping("/addproduct")
	public entity addProduct(@RequestBody entity product)
	{
		return productservice.SaveProduct(product);
	}
	
	
	@PostMapping("/addproducts")
	public List<entity> addProducts(@RequestBody List<entity> products)
	{
		return productservice.SaveProducts(products);
	}
	
	
	@GetMapping("/products")
	public List<entity> findall()
	{
		return productservice.GetAll();
	}
	
	@GetMapping("/productByID/{id}")
	@Cacheable(value = "product",key="#id")
	public entity getbyid(@PathVariable int id)
	{
		return productservice.GetByID(id);
	}
	@GetMapping("/productByName/{name}")
	public entity getbyname(@PathVariable String name)
	{
		return productservice.GetByname(name); 
	}
	
	@PutMapping("/update/{id}")
	@CachePut(value = "product",key="#id")
	public entity updateProduct(@RequestBody entity product,@PathVariable int id)
	{
		return productservice.Update(product,id);
	}
	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable int id)
	{
		return productservice.DeleteByID(id);
		
	}
	

}
