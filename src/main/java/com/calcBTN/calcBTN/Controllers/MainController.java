package com.calcBTN.calcBTN.Controllers;

import com.calcBTN.calcBTN.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("home", new Greeting());
        return "home";
    }


    @PostMapping("/")
    public String result(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("result", greeting);
        return "result";
    }


}


