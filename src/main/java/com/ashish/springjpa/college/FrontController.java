package com.ashish.springjpa.college;

import java.io.Console;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashish.springjpa.college.model.Students;
import com.ashish.springjpa.college.repo.StudentsRepo;

@Controller
public class FrontController {
	
	@Autowired
	StudentsRepo repo;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Called");
		return "home";
	}
	
	@RequestMapping("addStudent")
	public String addStudent(@ModelAttribute("stud") Students s) {
		repo.save(s);
		return "result";
	}
	
	@RequestMapping("searchByName")
	public String getStudentsByName(@RequestParam String name, Model m) {
		m.addAttribute("output", repo.findByName(name));
		
		return "output";
	}
	
	@RequestMapping("searchByRollNo")
	public String getStudentByRollNo(@RequestParam int roll_no, Model m) {
		m.addAttribute("output", repo.findById(roll_no));
		return "output";
	}
	
	@RequestMapping("searchAllStudents")
	public String getAllStudents(Model m) {
		m.addAttribute("output", repo.findAll());
		return "output";
	}
	
	@RequestMapping("removeByName")
	@Transactional
	public String removeStudentByName(@RequestParam String name, Model m) {
		repo.deleteByName(name);
		System.out.println("ccc");
		return "home";
	}
	
	@RequestMapping("removeByRollNo")
	public String removeStudentByRollNo(@RequestParam int roll_no, Model m) {
		repo.deleteById(roll_no);
		
		
		return "home";
	}
	
	@RequestMapping("updateByRollNo")
	public String updateStudentByRollNo(@RequestParam int roll_no, @RequestParam String name, @RequestParam String sname, Model m) {
		Optional<Students> s = repo.findById(roll_no);
		Students student = s.get();
		student.setName(name);
		student.setSname(sname);
		student.setRoll_no(roll_no);
		repo.save(student);
		m.addAttribute("output", student);
		return "output";
	}
		
}
