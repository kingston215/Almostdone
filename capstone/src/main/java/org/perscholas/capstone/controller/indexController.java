package org.perscholas.capstone.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller


public class indexController {


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

    @GetMapping("/PrivacyPolicy")
    public ModelAndView PrivacyPolicy() {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView("PrivacyPolicy");
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
    public ModelAndView Reservations() {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView("Reservations");
        return response;
    }

    @GetMapping("/TermsofUse")
    public ModelAndView TermsofUse() {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView("TermsofUse");
        return response;
    }

    @GetMapping("/WineExperience")
    public ModelAndView WineExperience() {
        // this function is for the home page of the website which is expressed as just a plain slash "/"
        ModelAndView response = new ModelAndView("WineExperience");
        return response;
    }


}