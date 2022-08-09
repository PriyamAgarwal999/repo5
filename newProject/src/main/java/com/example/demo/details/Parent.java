package com.example.demo.details;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Parent {

	@Id
	private int parentId;
	private String parentName;
	private int parentAge;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_parent_id" ,referencedColumnName = "parentId")
	private List<Child> childs;
	
	
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public int getParentAge() {
		return parentAge;
	}
	public void setParentAge(int parentAge) {
		this.parentAge = parentAge;
	}
	public List<Child> getChilds() {
		return childs;
	}
	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}
	
}
