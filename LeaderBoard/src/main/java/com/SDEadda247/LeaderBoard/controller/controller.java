package com.SDEadda247.LeaderBoard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SDEadda247.LeaderBoard.entity.entity;
import com.SDEadda247.LeaderBoard.service.service;


@RestController
@RequestMapping("/leaderboard")
public class controller {
	
	@Autowired
	private service productservice;
	
	
	@GetMapping("/showleaderboard")
	@Scheduled(cron = "*/15 * * * * *")
	public List<entity> leaderboard()
	{
		productservice.clear();
		productservice.genratetable();
		return productservice.showleaderboard();	
	}

}
