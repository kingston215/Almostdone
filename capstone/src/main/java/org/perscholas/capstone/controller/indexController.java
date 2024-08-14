package org.perscholas.capstone.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.capstone.database.DAO.UserDAO;
import org.perscholas.capstone.database.Entity.User;
import org.perscholas.capstone.form.CreateAccountFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Slf4j
@Controller

@RequestMapping("/")
public class indexController {
@Autowired
    UserDAO userDao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired


    UserDAO userDAO;

    @GetMapping("/")
    public ModelAndView index() {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView("index");
        return response;
    }

    @GetMapping("/Menu")
    public ModelAndView Menu() {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView("Menu");
        return response;
    }
    @PreAuthorize("isAuthenticated()")
    @GetMapping("/edit/{id}")
    public ModelAndView editUser(@PathVariable Integer id) {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView("Reservations");
        User user = userDAO.findUserById(id);
        response.addObject("form", user);
        return response;
    }

    @PostMapping("/edit/{id}")
    public ModelAndView editUserSubmit(CreateAccountFormBean formBean, Integer id) {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView();
        User user = userDAO.findUserById(id);
        user.setEmail(formBean.getEmail());
        user.setAge(formBean.getAge());
        userDao.save(user);
        response.setViewName("redirect:/http://localhost:8080/edit/1");
        return response;
    }

    @GetMapping("/PrivateEvents")
    public ModelAndView PrivateEvents() {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView("PrivateEvents");
        return response;
    }


    @GetMapping("/ProductCatalog")
    public ModelAndView ProductCatalog() {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView("ProductCatalog");
        return response;
    }

    @GetMapping("/Reservations")
    public ModelAndView createUser() {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView("Reservations");
        return response;
    }

    @PostMapping("/Reservations")
    ModelAndView createUserSubmit(@Valid CreateAccountFormBean form, BindingResult bindingResult, HttpSession session){
        ModelAndView response = new ModelAndView();
        User user = new User();
        user.setEmail(form.getEmail());
        String password = passwordEncoder.encode(form.getPassword());
        user.setPassword(password);
        user.setCreateTime(new Date().toInstant());
        user.setAge(form.getAge());
        userDao.save(user);
        response.setViewName("redirect: /Reservation");
        return response;
    }



    @GetMapping("/WineExperience")
    public ModelAndView WineExperience() {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView("WineExperience");
        return response;
    }


}