package com.ashish.springjpa.college.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.springjpa.college.model.Students;

public interface StudentsRepo extends JpaRepository<Students, Integer>{
	List<Students> findByName(String name);
	List<Students> deleteByName(String name);
}
