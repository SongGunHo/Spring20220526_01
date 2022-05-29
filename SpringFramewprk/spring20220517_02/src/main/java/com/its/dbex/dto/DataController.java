package com.its.dbex.dbex.dbex.controller;

import com.its.dbex.dbex.dto.repository.DataRepositoty;
import com.its.dbex.dbex.dto.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {
    @Autowired
    private DataService dataService;
    @Autowired
    private DataRepositoty dataRepositoty;

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/save-form")
    public String saveForm(){
        return "save-form";
    }
    @GetMapping("/save")
    public String save(@RequestParam("val1")String val1,@RequestParam("val2")String val2, Model model){
        System.out.println("vale1 = " + val1 + ", val2 = " + val2);
        model.addAttribute("v1", val1);
        model.addAttribute("v2", val2);
        dataService.save(val1, val2);
        return "save";
    }
}
