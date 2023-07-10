package com.smart.controller;



//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

//import com.smart.dao.UserRepository;
import com.smart.entities.User;

//import jakarta.servlet.http.HttpSession;
//import jakarta.validation.Valid;

import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;

//import com.smart.helper.*;






@Controller
public class HomeController {
	@RequestMapping("/")
    private String home(Model model){
        model.addAttribute("title", "Home - Smart Contact Manager");
        return "home";
    }

    @RequestMapping("/about")
    private String about(Model model){
        model.addAttribute("title", "About - Smart Contact Manager");
        return "about";
    }

    @RequestMapping("/signUp")
    private String signUp(Model model){
        model.addAttribute("title", "SignUp - Smart Contact Manager");
        model.addAttribute("user", new User());
        return "signUp";
    }

    // handler for custom login
    @GetMapping("/signIn")
    public String customLogin(Model model){
        model.addAttribute("title","Login - Smart Contact Manager");
        return "login";
    }
}