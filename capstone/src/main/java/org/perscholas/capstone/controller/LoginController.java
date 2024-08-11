package org.perscholas.capstone.controller;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.capstone.Security.AuthUtil;
import form.CreateAccountFormBean;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.perscholas.capstone.Service.UserServicetwo;
import org.perscholas.capstone.database.DAO.UserDAO;
import org.perscholas.capstone.database.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.hibernate.query.sqm.tree.SqmNode.log;
@Getter
@Setter
@ToString
@Slf4j
@Controller
@RequestMapping("/auth")
public class LoginController {
    @Autowired
private AuthUtil authutil;
    @Autowired
    private UserServicetwo userServicetwo;
    @Autowired
    private UserDAO userDao;
    @GetMapping("/login")
    ModelAndView index(@RequestParam(required = false) String error) {
        ModelAndView response = new ModelAndView("auth/login");

        return response;
    }
    @PostMapping("/login")
    ModelAndView login() {
        ModelAndView response = null;
        User user = authutil.getCurrentUserObject();
        User users = userDao.findByEmailIgnoreCase(user.getEmail());
        log.debug("${users}");
        response.addObject("user", user);
        return response;    }
    @GetMapping("/create-account")
    public ModelAndView createAccount() {
        ModelAndView response = new ModelAndView("auth/CreateAccount");

        return response;
    }

    @PostMapping("/create-account")
    public ModelAndView createAccountSubmit(@Valid CreateAccountFormBean form, BindingResult bindingResult, HttpSession session) {
        ModelAndView response = new ModelAndView("auth/CreateAccount");

        // homework if you want - check to make sure the email does not already exist
        // this is a great case the custom annotation that we made

        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.debug("Validation error : " + ((FieldError) error).getField() + " = " + error.getDefaultMessage());
            }

            response.addObject("bindingResult", bindingResult);
            response.addObject("form", form);
        } else {
            // there were no errors so we can create the new user in the database
            userServicetwo.createUser(form);
            authutil.manualAuthentication(session, form.getEmail(), form.getPassword());
        }

        return response;
    }
}