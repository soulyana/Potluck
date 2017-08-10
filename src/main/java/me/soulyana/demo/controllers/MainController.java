package me.soulyana.demo.controllers;


import me.soulyana.demo.model.PotObject;
import me.soulyana.demo.repository.PotObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private PotObjectRepository potObjectRepository;

    @RequestMapping("/")
    public String welcomePage()
    {
        return "welcome";
    }

    @GetMapping("/add")
    public String loadAddPage(Model model)
    {
        model.addAttribute("potObject", new PotObject());
        return "add";
    }

    @PostMapping("/add")
    public String processAddPage(@Valid PotObject potObject, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        return "addconfirm";
    }

    @GetMapping("/listAll")
    public String loadListAllPage(Model model)
    {
        Iterable<PotObject> potObjectList = potObjectRepository.findAll();
        model.addAttribute("listOfPotObjects", potObjectList);
        return "listAll";
    }

    @PostMapping("/listAll")
    public String loadListAllPage(@ModelAttribute PotObject potObject)
    {
        return "confirmpotObject";
    }

    @GetMapping("/searchFood")
    public String loadSearchFoodPage()
    {
        return "searchFood";
    }


}
