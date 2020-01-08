package com.gizet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "vets/vetIndex"})
    public String listVets() {
        return "vets/vetIndex";
    }
}
