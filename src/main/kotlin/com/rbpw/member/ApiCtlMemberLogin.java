package com.rbpw.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ApiCtlMemberLogin {

    @GetMapping("/test")

    
    fun action(model:Model): String {
        model["title"] = "testTitle" //model.addAttribute("title", "test")
        return "index"
    }
}
