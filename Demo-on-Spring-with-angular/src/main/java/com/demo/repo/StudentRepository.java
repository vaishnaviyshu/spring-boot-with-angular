package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.demo.model.Student; 
 
public interface StudentRepository   	extends JpaRepository<Student,Integer> 
{ 
 
}
