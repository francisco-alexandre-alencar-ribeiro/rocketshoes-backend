package com.spring.rest.controllers;

import com.spring.rest.model.Post;
import com.spring.rest.service.RestService;
import jdk.nashorn.api.scripting.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * Created by alexandre on 25/02/2020.
 */

@Controller
public class RestController {

    @Autowired
    RestService restService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        mv.addObject("posts", restService.findAll());
        return mv;
    }
}
