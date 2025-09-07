package com.zblab01.zblab01;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZBLab01Controller {
    @RequestMapping("/")
    public String index() {return "index";}

    @RequestMapping("/about")
    public String about() {return "about";}
}
