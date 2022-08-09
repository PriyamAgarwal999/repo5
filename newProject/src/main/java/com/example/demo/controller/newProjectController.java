package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dao.ChildDao;
import com.example.demo.dao.ParentDao;
import com.example.demo.dao.QuestionDao;
import com.example.demo.details.Child;
import com.example.demo.details.Parent;
import com.example.demo.details.Question;


@RestController
public class newProjectController {
	
	@Autowired
	private ParentDao parentDao;
	
	@Autowired
	private ChildDao childDao;
	
	@Autowired
	private QuestionDao questionDao;

	
	@GetMapping("getparent")
	public Optional<Parent> getParent() {
		return parentDao.findById(2);
	}
	
	@GetMapping("getChild")
	public Optional<Child> getChild(){
		return childDao.findById(3);
	}
	
	@PostMapping("addparent")
	public String addParent(@RequestBody Parent parent) {
		parentDao.save(parent);
		return "added!";
	}
	
	@DeleteMapping("/deleteproduct/{parentId}")
	public String deleteProduct(@PathVariable("parentId") int parentId) {
//		Optional<Parent> parent=parentDao.findById(parentId);
		parentDao.deleteById(parentId);
		return "product Deleted!!";
	}
	
	@PostMapping("addquestion/")
	public String addQuestion(@RequestBody Question question){
		questionDao.save(question);
		return "Question Added!!";
	}
	
//	@PostMapping("option")
//	public String getResponse(@RequestBody Response response){
////		return serviceLayer1.getResponse(response);
//		this.restTemplate.getForObject();
//	}
}
