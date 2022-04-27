package com.omkumar.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.omkumar.model.User;
import com.omkumar.service.UserService;

@Controller
public class RegistrationController {
  @Autowired
  public UserService userService;

  @RequestMapping("/register")
  public String showRegister(Model model) {
  model.addAttribute(new User());
  return "register";

  }


  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {
//  if (bindingResult.hasErrors()){
//    return "register";}
    ModelAndView mav = null;

    User user1 = userService.validateReg(user);

    if (null != user1) {
      mav = new ModelAndView("register");
      mav.addObject("message", "Username is Already Exist!!");

    }
    else {

      mav = new ModelAndView("welcome");
      userService.register(user);
    }

    return mav;
  }
}
