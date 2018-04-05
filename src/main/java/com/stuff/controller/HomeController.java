package com.stuff.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class HomeController {

    public HomeController() {
    }

    @RequestMapping(value = {"/"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ModelAndView redirect() throws IOException {
        return new ModelAndView("redirect:/indexes");
    }

    @RequestMapping(value = {"/indexes"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    public ModelAndView home(HttpServletRequest request, HttpServletResponse httpResponse) throws IOException {
        ModelAndView mav = new ModelAndView("/indexes.jsp");
        return mav;
    }
}