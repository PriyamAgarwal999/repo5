package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.details.Parent;



public interface ParentDao extends JpaRepository<Parent,Integer>{

}

