package me.soulyana.demo.controllers;

import me.soulyana.demo.model.PotObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/add")
    public String loadWelcomePage(Model model)
    {
        model.addAttribute("potObject", new PotObject());
        return "PotObject";
    }



}
