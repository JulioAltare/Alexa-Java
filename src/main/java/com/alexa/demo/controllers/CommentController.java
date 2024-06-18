package com.alexa.demo.controllers;

import com.alexa.demo.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/api/calls")
public class CommentController {


  CommentService service;
  @Autowired
  public CommentController(CommentService service){
    this.service = service;
  }

  @GetMapping
  public String allComments(Model model) {
    model.addAttribute("comments",service.addExampleComments());
    return "calls/index";
  }


}
