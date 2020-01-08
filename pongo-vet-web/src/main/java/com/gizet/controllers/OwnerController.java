package com.gizet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//alternative of the request mapping //
// this is going to be e.g. "/owners /owners/ownerIndex /owner/ownerIndex.html
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"", "/", "/ownerIndex", "ownerIndex.html"})
    public String listOwners() {
        return "owners/ownerIndex";
    }
}
