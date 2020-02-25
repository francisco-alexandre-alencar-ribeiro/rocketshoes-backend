package com.spring.rocketshoesBackend.controllers;

import com.spring.rocketshoesBackend.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by alexandre on 25/02/2020.
 */

@Controller
public class ProdutoController {

    @Autowired
    RestService restService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        mv.addObject("posts", restService.findAll());
        return mv;
    }
}
