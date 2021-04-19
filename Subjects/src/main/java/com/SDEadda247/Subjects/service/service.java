package com.SDEadda247.Subjects.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SDEadda247.Subjects.entity.entity;
import com.SDEadda247.Subjects.reposetiory.reposetiory;



@Service
public class service {
	
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

	public entity GetBysubjectname(String name) //// GET METHOD
	{
		return productRepo.findBysubjectname(name);
	}
	
	public String DeleteByID(int id) //// DELETE METHOD
	{
		productRepo.deleteById(id);
		return "DATA DELETED.";
	}

	public entity Update(entity product,int id) //// UPDATE METHOD
	{
		entity oldproduct = productRepo.findById(id).orElse(null);
		oldproduct.setSubjectname(product.getSubjectname());
		return productRepo.save(oldproduct);
	}

}
