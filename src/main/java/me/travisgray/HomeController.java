package me.travisgray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ${TravisGray} on 11/13/2017.
 */



@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/2")
    public String page2(){
        return "page2";
    }

    @RequestMapping("/3")
    public String page3(){
        return "page3";
    }
}
