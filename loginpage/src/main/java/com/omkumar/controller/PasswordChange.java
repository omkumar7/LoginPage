package com.omkumar.controller;

import com.omkumar.model.C_Password;
import com.omkumar.model.Login;
import com.omkumar.model.User;
import com.omkumar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class PasswordChange {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/changepassword", method = RequestMethod.GET)
    public ModelAndView changepassword(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("changepassword");
        mav.addObject("password1", new C_Password());

        return mav;
    }


    @RequestMapping(value = "/passwordprocess", method = RequestMethod.POST)
    public ModelAndView passwordprocess(HttpServletRequest request, HttpServletResponse response,
                                        @ModelAttribute("password1")C_Password password) {
        ModelAndView mav = null;
        User user = userService.validateUser1(password);
        if (null != user) {
            mav = new ModelAndView("passwordchange");
            userService.updatePassword(password);
        }
        else {
            mav = new ModelAndView("changepassword");
            mav.addObject("message", "Username or Password is wrong!!");
        }
        return mav;
    }



}