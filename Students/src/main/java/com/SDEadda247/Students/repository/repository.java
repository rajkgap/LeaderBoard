package com.SDEadda247.Students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SDEadda247.Students.entity.entity;


public interface repository extends JpaRepository<entity,Integer>{
	entity findByname(String name);

}
