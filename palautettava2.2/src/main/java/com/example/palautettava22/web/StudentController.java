package com.example.palautettava22.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.palautettava22.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Kimmo", "Kuusinen"));
		students.add(new Student("Kirsi", "Kataja"));
		students.add(new Student("Mari", "Siltanen"));
		
		model.addAttribute("students", students);
		
		return "hello";
	}

}
