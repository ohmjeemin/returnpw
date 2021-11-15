package com.rbpw.member

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ApiCtlMemberLogout {

    @GetMapping("/test")
    fun action(model: Model):String {
        model.get("title") = "testTitle"
        return "home"
    }

}