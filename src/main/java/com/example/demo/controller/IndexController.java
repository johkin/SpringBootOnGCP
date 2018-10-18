package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public @ResponseBody String index() {

        return "<html><body background='blue'>Hello World</body></html>";
    }


}
