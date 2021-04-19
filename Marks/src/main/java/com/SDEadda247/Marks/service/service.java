package com.SDEadda247.Marks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SDEadda247.Marks.entity.entity;
import com.SDEadda247.Marks.entity.entityid;
import com.SDEadda247.Marks.reposetiory.reposetiory;


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
	
	public entity GetByID(entityid id) //// GET METHOD
	{
		return productRepo.findById(id).orElse(null);
	}
	
	public String DeleteByID(entityid id) //// DELETE METHOD
	{
		productRepo.deleteById(id);
		return "DATA DELETED.";
	}

	public entity Update(entity product,entityid id) //// UPDATE METHOD
	{
		entity oldproduct = productRepo.findById(id).orElse(null);
		oldproduct.setMarks(product.getMarks());
		return productRepo.save(oldproduct);
	}

}
