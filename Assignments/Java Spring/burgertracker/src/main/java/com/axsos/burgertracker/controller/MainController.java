package com.axsos.burgertracker.controller;


import com.axsos.burgertracker.model.Burger;
import com.axsos.burgertracker.service.BurgerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    BurgerService burgerService;
    @GetMapping("/")
    public String index(@ModelAttribute("burger")Burger burger, Model model) {
        model.addAttribute("burgers", burgerService.findAllBurgers());
        return "index.jsp";
    }

    @PostMapping("/create")
    public String createBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult Result, Model model) {
        if (Result.hasErrors()) {
            model.addAttribute("burgers", burgerService.findAllBurgers());
            return "index.jsp";
        }
        burgerService.createBurger(burger);
        return "redirect:/";

    }


}
