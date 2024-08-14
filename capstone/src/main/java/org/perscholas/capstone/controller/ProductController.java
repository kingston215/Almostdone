package org.perscholas.capstone.controller;
import org.perscholas.capstone.form.CreateAccountFormBean;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.capstone.database.DAO.ProductDAO;
import org.perscholas.capstone.database.Entity.Wines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class ProductController {
    @Autowired
    private ProductDAO productDao;

    @GetMapping("/create")
    public ModelAndView createProduct() {
        ModelAndView response = new ModelAndView("create");
        return response;
    }

    @PostMapping("/create")
    public ModelAndView postProduct(BindingResult bindingResult, @Valid CreateAccountFormBean form) {
        ModelAndView response = new ModelAndView();
        if (bindingResult.hasErrors()) {
            for (ObjectError error : bindingResult.getAllErrors()) {
                log.debug("Validation error : {} = {}", ((FieldError) error).getField(), error.getDefaultMessage());
            }

            response.addObject("bindingResult", bindingResult);
            response.addObject("form", form);
        }
    return response;
    }
    @GetMapping("/search")
    ModelAndView search (@RequestParam(required = false) String searchterm){
        ModelAndView response = new ModelAndView("SearchBar");
        List<Wines> foundProducts = productDao.findByNameOrCode(searchterm);
        response.addObject("foundProducts", foundProducts);
        return response;
    }
}
