package com.sylinx.controller.sample2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample2Controller {

    @GetMapping("/sample2_1")
    public String sample2_1(){
        System.out.println("before");
        System.out.println("sample2_1 exec");
        System.out.println("end");
        return "sample2_1";
    }

    @GetMapping("/sample2_2/{user}")
    public String sample2_2(@PathVariable String user){
        System.out.println("before");
        System.out.println("sample2_2 exec");
        System.out.println("end");
        return "sample2_2";
    }
}
