package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.details.Child;

public interface ChildDao extends JpaRepository<Child,Integer>{

}
