/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ricar_t6uqtj3
 */
@Controller
public class LoginCrontroller {
    
    @GetMapping("/login")
    public String index(){
        return "/login";
    }
    
}
