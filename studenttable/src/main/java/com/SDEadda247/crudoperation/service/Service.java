package com.SDEadda247.crudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SDEadda247.crudoperation.entity.entity;
import com.SDEadda247.crudoperation.reposetiory.reposetiory;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private reposetiory productRepo;

	public entity SaveProduct(entity product) //// POST METHOD
	{
		return productRepo.save(product);
	}

	public List<entity> SaveProducts(List<entity> products) //// POST METHOD
	{
		return productRepo.saveAll(products);
	}

	public List<entity> GetAll() //// GET METHOD
	{
		return productRepo.findAll();
	}

	public entity GetByID(int id) //// GET METHOD
	{
		return productRepo.findById(id).orElse(null);
	}

	public entity GetByname(String name) //// GET METHOD
	{
		return productRepo.findByname(name);
	}

	public String DeleteByID(int id) //// DELETE METHOD
	{
		productRepo.deleteById(id);
		return "DATA DELETED.";
	}

	public entity Update(entity product,int id) //// UPDATE METHOD
	{
		entity oldproduct = productRepo.findById(id).orElse(null);
		oldproduct.setName(product.getName());
		oldproduct.setPrice(product.getPrice());
		oldproduct.setQuntity(product.getQuntity());
		return productRepo.save(oldproduct);
	}

}
