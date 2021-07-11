package com.ashish.springjpa.college;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.springjpa.college.model.Students;
import com.ashish.springjpa.college.repo.StudentsRepo;

@RestController
public class ApiController {
	
	@Autowired
	StudentsRepo repo;

	@GetMapping(path="students", produces= {"application/xml"})
	//@ResponseBody 
	public List<Students> getAllStudents() {
		List<Students> students =  repo.findAll();
		System.out.println("fetching Students");
		//int i = 9/0;
		return students;
	}
	
	@GetMapping("student/{roll_no}")
	//@ResponseBody
	public Students getStudent(@PathVariable("roll_no") int roll_no) {
		Students st = repo.findById(roll_no).orElse(new Students(0, "", ""));
		//Students students = st.get();
		return st;
	}
	
	@PostMapping(path="student", consumes="application/json")
	public Students addStudent(@RequestBody Students s)
	{
		repo.save(s);
		System.out.println("Called");
		return s;
	}
}
