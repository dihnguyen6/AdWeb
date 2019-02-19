package com.g4soft.AdWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping(path = "/")
    public String login() {
        return "anonymous/login";
    }
}
