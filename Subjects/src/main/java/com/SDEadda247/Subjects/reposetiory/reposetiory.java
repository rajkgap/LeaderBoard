package com.SDEadda247.Subjects.reposetiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SDEadda247.Subjects.entity.entity;


public interface reposetiory extends JpaRepository<entity,Integer>{
	entity findBysubjectname(String name);

}
