package com.gizet.controllers;

import com.gizet.services.interfaces.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//alternative of the request mapping //
// this is going to be e.g. "/owners /owners/ownerIndex /owner/ownerIndex.html
@RequestMapping("/owners")
public class OwnerController {

    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/ownerIndex", "ownerIndex.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/ownerIndex";
    }

    @RequestMapping({"/find", "/vets", "/oups"})
    public String findOwners() {
        return "notImplemented";
    }
}
