package com.sylinx.controller.sample1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample1Controller {

    @GetMapping("/sample1")
    public String sample1(){
        System.out.println("sample1 exec");
        return "sample1_1";
    }
}
