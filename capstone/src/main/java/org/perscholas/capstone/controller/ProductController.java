package org.perscholas.capstone.controller;
import lombok.extern.slf4j.Slf4j;
import org.perscholas.capstone.database.DAO.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Slf4j
@Controller
public class ProductController {
@Autowired
private ProductDAO dao;
    @GetMapping("/create")
    public ModelAndView createProduct() {
        ModelAndView response = new ModelAndView("create");
        return response;
    }
    @GetMapping("/search")
            ModelAndView search(@RequestParam(required=false) String searchterm) {
    ModelAndView response = new ModelAndView("SearchBar");

    return response;
    }
}
