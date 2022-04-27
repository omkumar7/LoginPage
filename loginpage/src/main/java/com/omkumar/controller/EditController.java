package com.omkumar.controller;

import com.omkumar.model.C_Password;
import com.omkumar.model.Edit;
import com.omkumar.model.Login;
import com.omkumar.model.User;
import com.omkumar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class EditController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView showEdit(HttpServletRequest request, HttpServletResponse response,
                                 @ModelAttribute("edit1") Login login) {
        ModelAndView mav = null;
        mav = new ModelAndView("validateforedit");

        return mav;
    }

    @RequestMapping(value = "/editprocess", method = RequestMethod.POST)
    public ModelAndView editprocess(HttpServletRequest request, HttpServletResponse response,
                                    @ModelAttribute("edit2")Edit edit) {
        ModelAndView mav = null;
        User user = userService.validate(edit);
        if (null != user) {
            mav = new ModelAndView("edit");
            mav.addObject("username",user.getUsername());
            mav.addObject("firstname", user.getFirstname());
            mav.addObject("lastname",user.getLastname());
            mav.addObject("phone",user.getPhone());
            mav.addObject("email",user.getEmail());
            mav.addObject("address",user.getAddress());
            mav.addObject("password",user.getPassword());

        }
        else {
            mav = new ModelAndView("validateforedit");
            mav.addObject("message", "Password is wrong!!");
        }
        return mav;
    }


    @RequestMapping(value = "/editprocess1", method = RequestMethod.POST)
    public ModelAndView editprocess1(HttpServletRequest request, HttpServletResponse response,
                                     @ModelAttribute("edit") Edit edit) {
        ModelAndView mav = null;

        mav = new ModelAndView("edited");
        userService.edit(edit);

        return mav;
    }
}