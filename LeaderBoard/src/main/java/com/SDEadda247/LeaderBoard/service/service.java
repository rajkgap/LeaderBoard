package com.SDEadda247.LeaderBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SDEadda247.LeaderBoard.entity.entity;
import com.SDEadda247.LeaderBoard.repository.repository;


@Service
public class service {
	
	@Autowired
	private repository productRepo;

	
	public void genratetable()
	{
		productRepo.genratetable();
	}
	
	public List<entity> showleaderboard()
	{
		return productRepo.showleaderboard();
	}
	
	public void clear()
	{
		productRepo.clear();
	}
}
