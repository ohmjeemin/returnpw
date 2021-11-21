package com.rbpw.member

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ApiCtlMemberLogout {
    @GetMapping("/")
    fun action(model: Model):String {
        model.addAttribute("greeting", "Hello")
        return "home"
    }

}