package com.haryharsono.aplikasihary.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerMahasiswa {

   @ResponseBody
   @GetMapping
    public String tampil(){

        return "tampilan";
    }

}
