package com.its.people;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeopleController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/save-form")
    public String saveFrom(@RequestParam("lsh")String lsh, @RequestParam("shg")String shg){
        System.out.println("lsh = " + lsh + ", shg = " + shg);
        System.out.println("PeopleController.save-form");
        return null;
    }
}
