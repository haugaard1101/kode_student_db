package com.example.mysql.controller;


import com.example.mysql.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {

    private StudentService service = new StudentService();

    @GetMapping("/create")
    public String index(){
        return "index";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("students", service.getAllStudents());
        return "list";
    }


    @PostMapping("/create")
    public String create(WebRequest payload){

        service.create(payload);
        return "redirect:/";
    }

}
