package com.example.lombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lombok.Pojo.StudentResponse;

@RestController
public class StudentRestController {

	@GetMapping("/get")
	//@RequestMapping(value = "/get", method = RequestMethod.GET)
	public StudentResponse getStudent () {
		StudentResponse studentResponse = new StudentResponse(1, "John", "Smith");
		return studentResponse;
	}
}
