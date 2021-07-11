package com.ashish.springjpa.college;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.ashish.springjpa.college.model.Students;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public * com.ashish.springjpa.college.ApiController.getAllStudents())")
	public void logBefore() {
		LOGGER.info("getAllStudents method called");
	}
	
	@After("execution(public * com.ashish.springjpa.college.ApiController.getAllStudents())")
	public void logAfter() {
		LOGGER.info("getAllStudents was executed with/without exception");
	}
	
	@AfterReturning("execution(public * com.ashish.springjpa.college.ApiController.getAllStudents())")
	public void logAfterSuccess() {
		LOGGER.info("getAllStudents executed successfully");
	}
	
	@AfterThrowing("execution(public * com.ashish.springjpa.college.ApiController.getAllStudents())")
	public void logAfterExcetption() {
		LOGGER.warn("getAllStudents thrown exception");
	}
}
