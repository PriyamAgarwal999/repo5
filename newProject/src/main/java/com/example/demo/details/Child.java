package com.example.demo.details;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Child {


	@Id
	private int childId;
	
	private String childName;
	private int childAge;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_parent_id" ,referencedColumnName = "parentId")
	private Parent parent;
	
	public int getChildId() {
		return childId;
	}
	public void setChildId(int childId) {
		this.childId = childId;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public int getChildAge() {
		return childAge;
	}
	public void setChildAge(int childAge) {
		this.childAge = childAge;
	}
	
	@JsonIgnore
	public Parent getParent() {
		return parent;
	}
	
	@JsonIgnore
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	public int getParentId() {
		return parent.getParentId();
	}
	
}