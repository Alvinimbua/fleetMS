package com.imbuka.fleetms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }


    @GetMapping("/pages-contact")
    public String contact() {
        return "pages-contact";
    }
}
