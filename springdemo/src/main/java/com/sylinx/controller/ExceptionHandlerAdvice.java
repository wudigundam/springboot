package com.sylinx.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {
    //...
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        System.out.println("handleException-begin");
        e.printStackTrace();
        System.out.println("handleException-end");
        return "error!!";
    }
}
