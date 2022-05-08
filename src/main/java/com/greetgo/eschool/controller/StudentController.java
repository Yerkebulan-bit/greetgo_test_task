package com.greetgo.eschool.controller;

import com.greetgo.eschool.dao.StudentMapper;
import com.greetgo.eschool.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class StudentController {

    StudentMapper studentMapper;

    @Autowired
    public StudentController(StudentMapper studentMapper){
        this.studentMapper = studentMapper;
    }

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("studentList", studentMapper.getAllStudents());
        modelAndView.addObject("student", new Student());
        return modelAndView;
    }

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(HttpServletRequest request){
        if ((request.getParameter("Username") == null) || (request.getParameter("Password") == null)){
            request.getSession().setAttribute("errorMsg", "Please, enter your credentials");
            return login();
        }

        if(!(request.getParameter("Username").equals("admin")) || !(request.getParameter("Password").equals("admin"))){
            request.getSession().setAttribute("errorMsg", "Incorrect credentials, please try again");
            return login();
        }

        request.getSession().setAttribute("user", "admin");
        return index();
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("student") Student student){
        studentMapper.insertStudent(student);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") int id){
        studentMapper.deleteStudent(id);
        return "redirect:/";
    }
}
