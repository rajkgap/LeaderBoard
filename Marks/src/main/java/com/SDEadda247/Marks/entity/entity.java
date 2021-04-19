package com.SDEadda247.Marks.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "MARKS_TABLE")
public class entity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2692925612971216081L;

	@EmbeddedId
	private entityid Marksid;
	private int Marks;

	public entity() {

	}

	public entity(entityid marksid, int marks) {
		this.Marksid = marksid;
		this.Marks = marks;
	}

	public entityid getMarksid() {
		return Marksid;
	}

	public void setMarksid(entityid marksid) {
		Marksid = marksid;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

}
