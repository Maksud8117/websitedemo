package com.website.bold.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() { return "index";}

    @RequestMapping("/products")
    public String products() { return "products";}

    @RequestMapping("/services")
    public String services() { return "services";}

    @RequestMapping("/pricing")
    public String pricing() { return "pricing";}

    @RequestMapping("/about")
    public String about() { return "about";}

    @RequestMapping("/contact")
    public String contact() { return "contact";}
}
