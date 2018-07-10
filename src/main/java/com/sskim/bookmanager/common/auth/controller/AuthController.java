package com.sskim.bookmanager.common.auth.controller;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sskim.bookmanager.common.auth.entity.UserEntity;
import com.sskim.bookmanager.common.auth.service.AuthService;


@Controller
public class AuthController {

   @Autowired
   private AuthService authService;

   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String userForm(Locale locale, Model model) {

      model.addAttribute("user", new UserEntity());
      model.addAttribute("users", authService.list());

      return "userForm";
   }

   @PostMapping("/saveUser")
   public String saveUser(@ModelAttribute("user") UserEntity userEntity,// @Valid UserEntity userEntity,
         BindingResult result, Model model) {

      if (result.hasErrors()) {
         
         model.addAttribute("users", authService.list());
         return "userForm";
      }

      authService.save(userEntity);

      return "redirect:/";
   }
}