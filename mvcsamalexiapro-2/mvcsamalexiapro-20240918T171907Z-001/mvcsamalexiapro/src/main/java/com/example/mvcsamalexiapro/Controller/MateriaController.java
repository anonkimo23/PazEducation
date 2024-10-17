package com.example.mvcsamalexiapro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MateriaController {
     @GetMapping("/Materia")
    public String getInputs() {
        return "Materia";
    }

}
