package com.learn.springbootkubernetes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    public String index() {
        return "Hello Spring-Boot, la aplecacion se ha desplegado correctamente";
    }
}
