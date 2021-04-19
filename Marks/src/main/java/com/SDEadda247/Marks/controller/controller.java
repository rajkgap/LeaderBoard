package com.SDEadda247.Marks.controller;

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

import com.SDEadda247.Marks.entity.entity;
import com.SDEadda247.Marks.entity.entityid;
import com.SDEadda247.Marks.marksrequest.marksrequest;
import com.SDEadda247.Marks.service.service;

@RestController
@RequestMapping("/marks")
public class controller {
	
	@Autowired
	private service productservice;
	
	
	@PostMapping("/addmarks")
	public entity addProduct(@RequestBody marksrequest Marksrequest)
	{
		entity Entity = new entity(new entityid(Marksrequest.getStudent_id(), Marksrequest.getSubject_id()),Marksrequest.getMarks());
		return productservice.SaveProduct(Entity);
		
	}
	
	@GetMapping("/showmarks")
	public List<entity> findall()
	{
		List<entity> data=productservice.GetAll();
		return data;
	}
	
//	@GetMapping("/marksByID/{id}")
//	public entity getbyid(@PathVariable entityid id)
//	{
//		return productservice.GetByID(id);
//	}
	
//	@PutMapping("/updatemarks/{id}")
//	public entity updateProduct(@RequestBody marksrequest Marksrequest,@PathVariable entityid id)
//	{
//		entity Entity = new entity(new entityid(Marksrequest.getStudent_id(), Marksrequest.getSubject_id()),Marksrequest.getMarks());
//		return productservice.Update(Entity,id);
//	}
//	@DeleteMapping("/deletemarks/{id}")
//	public String deletebyid(@PathVariable entityid id)
//	{
//		return productservice.DeleteByID(id);
//		
//	}

}
