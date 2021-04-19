package com.SDEadda247.Marks.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Embeddable
public class entityid implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5534482797295913836L;

	private int student_id;
	private int subject_id;

	public entityid() {

	}

	public entityid(int student_id, int subject_id) {
		super();
		this.student_id = student_id;
		this.subject_id = subject_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

}
