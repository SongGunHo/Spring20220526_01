package com.its.member.controller;

import com.its.member.dto.BoardDTO;
import com.its.member.servce.BoardServlce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
 @Autowired
    private BoardServlce boardServlce;
 @GetMapping("/boardsaev-form")
    public String boardsaveForm(){
     return "boardsave-form";
 }
 @PostMapping("/boardsave")
    public String boardsave(@ModelAttribute BoardDTO boardDTO){
     boolean a = boardServlce.save(boardDTO);
     return "boardsave";
 }


}