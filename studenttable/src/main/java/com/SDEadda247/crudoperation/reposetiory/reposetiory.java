package com.SDEadda247.crudoperation.reposetiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SDEadda247.crudoperation.entity.entity;

public interface reposetiory extends JpaRepository<entity,Integer>{
	entity findByname(String name);

}
