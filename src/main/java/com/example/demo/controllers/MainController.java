package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repositories.UserRepository;
import com.example.demo.repositories.StudentRepository;

@Controller
public class MainController {
	@Autowired
    UserRepository userRepo;
	@Autowired
	StudentRepository studentRepo;
	
    @RequestMapping("/students")
    public String stud(Model model) {
         model.addAttribute("students", studentRepo.findAll());
         return "students";
    }
	
    @RequestMapping("/users")
    public String home(Model model) {
         model.addAttribute("users", userRepo.findAll());
         return "users";
    }
	
	@RequestMapping("/hello")
    String getView(Model model) {
        model.addAttribute("msg", "Hello there, This message has been injected from the controller method");
        return "helloworld";
    }
}