package org.perscholas.capstone.controller;

import form.CreateAccountFormBean;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.hibernate.query.sqm.tree.SqmNode.log;

@Controller
@RequestMapping("/auth")
public class LoginController {
    @GetMapping("/login")
    ModelAndView index(@RequestParam(required = false) String error) {
        ModelAndView response = new ModelAndView("auth/login");
        return response;
    }

    //    @PostMapping("/login")
//    ModelAndView login() {
//        ModelAndView response = null;
//        User user = authenticatedUserUtils.getCurrentUserObject();
//        response.addObject("user", user);
//        return response;    }
    @GetMapping("/create-account")
    public ModelAndView createAccount() {
        ModelAndView response = new ModelAndView("auth/create-account");

        return response;
    }

    @PostMapping("/create-account")
    public ModelAndView createAccountSubmit(@Valid CreateAccountFormBean form, BindingResult bindingResult, HttpSession session) {
        ModelAndView response = new ModelAndView("auth/create-account");

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
            userService.createUser(form);
            AuthUtil.manualAuthentication(session, form.getEmail(), form.getPassword());
        }

        return response;
    }
}