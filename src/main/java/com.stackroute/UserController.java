package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @PostMapping("/show")
    public ModelAndView getName(HttpServletRequest req) {
        int numb1 = Integer.parseInt(req.getParameter("numb1"));
        int numb2 = Integer.parseInt(req.getParameter("numb2"));

        ModelAndView modelAndView = new ModelAndView("display");
        modelAndView.addObject("value", String.valueOf(numb1 + numb2))  ;
        return modelAndView;
    }
}
